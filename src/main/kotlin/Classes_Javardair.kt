package org.example

data class Script(val instructions: List<Instruction>, val parameters: List<String>) {
    fun validate(): List<VarError> {
        val errors = mutableListOf<VarError>()
        val definedVariables = parameters.toMutableList()
        val scopeStack = mutableListOf<ControlStructure>()

        fun checkExpression(expression: Expression, lineIndex: Int) {
            when (expression) {
                is Variable -> {
                    // Check against the first part of the path, as it holds the base variable name
                    if (expression.path.isEmpty() || !definedVariables.contains(expression.path.first())) {
                        errors.add(VarError(expression.path.firstOrNull() ?: "Unknown", lineIndex))
                    }
                }
                is BinaryExpression -> {
                    checkExpression(expression.left, lineIndex)
                    checkExpression(expression.right, lineIndex)
                }
                is Literal -> {}
                is StringLiteral -> {}
            }
        }

        var lineIndex = 0
        instructions.accept { instruction, isEntering ->
            when(instruction) {
                is ControlStructure -> {
                    if(isEntering) {
                        if(instruction.sequence.isEmpty()) {
                            errors.add(VarError("Empty inner block for: ${instruction.javaClass.simpleName}", lineIndex))
                        }
                        if (instruction is ForLoop && !definedVariables.contains(instruction.loopVariable)) {
                            definedVariables.add(instruction.loopVariable)
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
                is CompoundAssign -> {
                    print("para completar")
                }
                is Print -> {
                    checkExpression(instruction.expression, lineIndex)
                }
                is Break -> {
                    if (scopeStack.none { it is ForLoop }) {
                        errors.add(VarError("'break' fora de 'for loop'", lineIndex))
                    }
                }
            }
            lineIndex++
        }

        return errors
    }

    override fun toString(): String {
        val formattedInstructions = instructions.map { instruction ->
            val str = instruction.toString()
            when (instruction) {
                is ControlStructure -> str  // While and IfElse already handle their own formatting
                else -> str  // Add semicolon to simple instructions
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
    val sequence: List<Instruction>
}

data class IfElse(val guard: Expression,
                  override val sequence: List<Instruction>,
                  val alternative: List<Instruction>? = null): ControlStructure {
    override fun toString(): String {
        val seqStr = sequence.joinToString("\n\t")
        val result = "if($guard) <<\n\t$seqStr\n>>"

        return if (!alternative.isNullOrEmpty()) {
            val altStr = alternative.joinToString("\n\t")
            "$result else <<\n\t$altStr\n>>"
        } else {
            result
        }
    }
}

data class ForLoop(val loopVariable: String,
                   val iterable: Expression,
                   override val sequence: List<Instruction>): ControlStructure {
    override fun toString(): String {
        val seqStr = sequence.joinToString("\n\t")
        return "for ($loopVariable >>> $iterable) <<\n\t$seqStr\n>>"
    }
}

class Break: Instruction {
    override fun toString(): String {
        return "break."
    }
}

data class Assign(val type: Type, val variableName: String, val expression: Expression): Instruction {
    override fun toString(): String {
        return "$variableName := $expression."
    }
}
data class CompoundAssign(
    val variableName: String,
    val operator: Operator,
    val expression: Expression
) : Instruction {
    override fun toString() = "$variableName ${operator}= $expression."
}

data class Print(val expression: Expression): Instruction {
    fun print(outputBuilder: StringBuilder, interpreter: Interpreter) {
        outputBuilder.append(interpreter.calc(expression).toString()).append("\n")
    }

    override fun toString(): String {
        return "print($expression)."
    }
}

sealed interface Expression

data class Literal(val value: Int): Expression {
    override fun toString(): String {
        return "$value"
    }
}

data class StringLiteral(val value: String): Expression {
    override fun toString(): String {
        return value
    }
}

data class Variable(val path: List<String>): Expression {
    override fun toString(): String {
        return path.joinToString("..")
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