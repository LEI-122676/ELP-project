package org.example

data class Script(val instructions: List<Instruction>, val parameters: List<String>) {
    fun validate(): List<VarError> {
        val errors = mutableListOf<VarError>()
        val definedVariables = parameters.toMutableList()
        val scopeStack = mutableListOf<ControlStructure>()

        fun checkExpression(expression: Expression, lineIndex: Int) {
            when (expression) {
                is Variable -> {
                    if (!definedVariables.contains(expression.variableName)) {
                        errors.add(VarError(expression.variableName, lineIndex))
                    }
                }
                is BinaryExpression -> {
                    checkExpression(expression.left, lineIndex)
                    checkExpression(expression.right, lineIndex)
                }
                is Literal -> {}
            }
        }

        var lineIndex = 0
        instructions.accept { instruction, isEntering ->
            when(instruction) {
                is ControlStructure -> {
                    if(isEntering) {
                        if(instruction.sequence.isEmpty()) {
                            errors.add(VarError("if", lineIndex))
                        }
                        scopeStack.addLast(instruction)
                    } else {
                        scopeStack.removeLast()
                    }
                }
                is Assign -> {
                    checkExpression(instruction.expression, lineIndex)
                    if (!definedVariables.contains(instruction.variableName)) {
                        definedVariables.add(instruction.variableName)
                    }
                }
                is Print -> {
                    checkExpression(instruction.expression, lineIndex)
                }
                is Break -> {
                    if (scopeStack.none { it is While }) {
                        errors.add(VarError("'break' fora de 'while'", lineIndex))
                    }
                }
            }
            lineIndex++
        }

        instructions.forEachIndexed { lineIndex, instruction ->
            when (instruction) {
                is ControlStructure -> {
                    checkExpression(instruction.guard, lineIndex)

                }
                is Assign -> {

                }
                is Print -> {
                    checkExpression(instruction.expression, lineIndex)
                }
                is Break -> {
                    // TODO - verificar se está dentro de ciclo?
                }
            }
        }

        return errors
    }

    override fun toString(): String {
        val formattedInstructions = instructions.map { instruction ->
            val str = instruction.toString()
            when (instruction) {
                is ControlStructure -> str  // While and IfElse already handle their own formatting
                else -> "$str"  // Add semicolon to simple instructions
            }
        }.joinToString("\n")
        return formattedInstructions
    }
}

data class VarError(val varId: String, val line: Int) {
    override fun toString(): String {
        return "On line $line --- problem with: $varId"
    }
}

sealed interface Instruction

sealed interface ControlStructure: Instruction {
    val guard: Expression                                               // == condition
    val sequence: List<Instruction>
}

data class IfElse(override val guard: Expression,
                  override val sequence: List<Instruction>,
                  val alternative: List<Instruction>? = null): ControlStructure {
    override fun toString(): String {
        val seqStr = sequence.joinToString("\n\t")
        val result = "if ($guard) {\n\t$seqStr\n}"

        return if (alternative != null && alternative.isNotEmpty()) {
            val altStr = alternative.joinToString("\n\t")
            "$result else {\n\t$altStr\n}"
        } else {
            result
        }
    }
}

data class While(override val guard: Expression,
                 override val sequence: List<Instruction>): ControlStructure {
    override fun toString(): String {
        val seqStr = sequence.joinToString("\n\t")
        return "while ($guard) {\n\t$seqStr\n}"
    }
}

class Break: Instruction {
    override fun toString(): String {
        return "break;"
    }
}

data class Assign(val type: Type, val variableName: String, val expression: Expression): Instruction {
    override fun toString(): String {
        return "$variableName = $expression;"
    }
}

data class Print(val expression: Expression): Instruction {
    fun print() {
        println(toString())
    }

    override fun toString(): String {
        return "print $expression;"
    }
}

sealed interface Expression

data class Literal(val value: Int): Expression {
    override fun toString(): String {
        return "$value"
    }
}

data class Variable(val variableName: String): Expression {
    override fun toString(): String {
        return variableName
    }
}

data class BinaryExpression(val left: Expression, val operator: Operator, val right: Expression): Expression {
    override fun toString(): String {
        return "$left $operator $right"
    }
}

enum class Type {
    MUTABLE {
        override fun toString(): String {
            return "mut"
        }
    },
    CONSTANT {
        override fun toString(): String {
            return "const"
        }
    }
}

enum class Operator {
    PLUS {
        override fun toString(): String {
            return "+"
        }
    },
    MINUS {
        override fun toString(): String {
            return "-"
        }
    },
    TIMES {
        override fun toString(): String {
            return "*"
        }
    },
    DIVISION {
        override fun toString(): String {
            return "/"
        }
    },
    MODULE {
        override fun toString(): String {
            return "%"
        }
    },
    EQUALSTO {
        override fun toString(): String {
            return "=="
        }
    },
    DIFFERENT {
        override fun toString(): String {
            return "!="
        }
    },
    LESSTHEN {
        override fun toString(): String {
            return "<"
        }
    },
    LESSOREQUALTO {
        override fun toString(): String {
            return "<="
        }
    },
    GREATERTHEN {
        override fun toString(): String {
            return ">"
        }
    },
    GREATEROREQUALTO {
        override fun toString(): String {
            return ">="
        }
    }
}

fun List<Instruction>.accept(visitor: (Instruction, Boolean) -> Unit): Unit =
    forEach {
        visitor(it, true)

        if(it is ControlStructure) {
            it.sequence.accept(visitor)

            if(it is IfElse)
                it.alternative?.accept(visitor)

            visitor(it, false)
        }
    }