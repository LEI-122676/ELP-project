package org.example

import WriteOnceMap

class Interpreter(var script: Script) {
    private val mutMemory = mutableMapOf<String, Any?>()
    private val constMemory = WriteOnceMap<String, Any?>()

    fun addConst(name: String, value: Any?) {
        if(!constMemory.containsKey(name)) {
            constMemory.put(name, value)
        }
    }

    fun runScript(newScript: Script, outputBuilder: StringBuilder) {
        this.script = newScript

        if (script.validate().isNotEmpty()) {
            println("Erro de validação no script.")
            return
        }

        runInstructions(script.instructions, outputBuilder)
    }

    class BreakException : RuntimeException()

    private fun runInstructions(instructions: List<Instruction>, outputBuilder: StringBuilder) {
        for (it in instructions) {
            if (it is Assign){
                if (it.type == Type.CONSTANT)
                    constMemory.put(it.variableName, calc(it.expression))
                else if (it.type == Type.MUTABLE)
                    mutMemory[it.variableName] = calc(it.expression)
                else
                    println("Tipo de variável não reconhecido.")
            }
            else if (it is Print) {
                it.print(outputBuilder, this)
            }
            else if (it is Break) {
                throw BreakException()
            }
            else if (it is IfElse) {
                val cond = calc(it.guard)
                val isTrue = cond != null && cond != 0 && cond != false && cond != "0" && cond != ""

                if (isTrue) {
                    runInstructions(it.sequence, outputBuilder)
                } else if (it.alternative != null) {
                    runInstructions(it.alternative, outputBuilder)
                }
            }
            else if (it is ForLoop) {
                val iterable = calc(it.iterable)
                val keysToIterate = when (iterable) {
                    is Map<*, *> -> iterable.keys.toList()
                    is List<*> -> iterable.indices.toList()
                    else -> emptyList<Any>()
                }

                for (key in keysToIterate) {
                    mutMemory[it.loopVariable] = key
                    try {
                        runInstructions(it.sequence, outputBuilder)
                    } catch (e: BreakException) {
                        break
                    }
                }
            }
        }
    }

    fun run(param: List<Pair<String, Any?>>) {
        if (!script.validate().isEmpty()) return

        param.forEach {
            constMemory.put(it.first, it.second) //  == .put(it.first, it.second)
        }

        runInstructions(script.instructions, java.lang.StringBuilder())
    }

    fun calc(exp: Expression): Any? {
        return when (exp) {
            is Literal -> exp.value
            is StringLiteral -> exp.value
            is Variable -> {
                var current: Any? = constMemory.get(exp.path.first())
                    ?: mutMemory[exp.path.first()]
                    ?: throw RuntimeException("Erro: Variável '${exp.path.first()}' não está definida!")

                for (i in 1 until exp.path.size) {
                    val part = exp.path[i]
                    // Resolve part dynamically if it matches a known variable, otherwise use as literal key
                    val actualKey = if (mutMemory.containsKey(part) || constMemory.containsKey(part)) {
                        (constMemory.get(part) ?: mutMemory[part]).toString()
                    } else {
                        part
                    }

                    if (current is Map<*, *>) {
                        current = current[actualKey]
                    } else if (current is List<*>) {
                        val idx = actualKey.toIntOrNull() ?: throw RuntimeException("Index não é inteiro!")
                        current = current[idx]
                    } else {
                        throw RuntimeException("Impossível aceder a propriedade de $current")
                    }
                }
                current
            }
            is BinaryExpression -> {
                val left = calc(exp.left)
                val right = calc(exp.right)

                if (exp.operator == Operator.PLUS && (left is String || right is String)) {
                    return left.toString() + right.toString()
                }

                val leftInt = left?.toString()?.toIntOrNull() ?: 0
                val rightInt = right?.toString()?.toIntOrNull() ?: 0

                when (exp.operator) {
                    Operator.PLUS -> leftInt + rightInt
                    Operator.MINUS -> leftInt - rightInt
                    Operator.TIMES -> leftInt * rightInt
                    Operator.DIVISION -> if (rightInt != 0) leftInt / rightInt else throw RuntimeException("Divisão por zero!")
                    Operator.MODULE -> if (rightInt != 0) leftInt % rightInt else throw RuntimeException("Divisão por zero!")
                    Operator.EQUALSTO -> if(left == right) 1 else 0
                    Operator.DIFFERENT -> if(left != right) 1 else 0
                    Operator.LESSTHEN -> if(leftInt < rightInt) 1 else 0
                    Operator.LESSOREQUALTO -> if(leftInt <= rightInt) 1 else 0
                    Operator.GREATERTHEN -> if(leftInt > rightInt) 1 else 0
                    Operator.GREATEROREQUALTO -> if(leftInt >= rightInt) 1 else 0
                }
            }
        }
    }
}
