package org.example

import WriteOnceMap

class Interpreter(val script: Script) {
    private val mutMemory = mutableMapOf<String, Int>()
    private val constMemory = WriteOnceMap<String, Int>()

    fun run(param: List<Pair<String, Int>>) {
        if (!script.validate().isEmpty()) return

        param.forEach {
            constMemory.put(it.first, it.second) //  == .put(it.first, it.second)
        }

        script.instructions.forEach {
            if (it is Assign){
                // Checkar se variável já existe em memória
                if (mutMemory.containsKey(it.variableName) || constMemory.containsKey(it.variableName))
                    println("Variável já existe em memória.")

                if (it.type == Type.CONSTANT)
                    constMemory.put(it.variableName, calc(it.expression))

                else if (it.type == Type.MUTABLE)
                    mutMemory[it.variableName] = calc(it.expression)

                else
                    println("Tipo de variável não reconhecido.")
            }
            else if (it is Print) {
                println("${it.expression} = ${calc(it.expression)}")
            }
            else if (it is Break) {
                // TODO...
            }
            else if (it is ControlStructure) {
                // TODO...
            }

        }
    }
// const a = (2 - 1) * N
    fun calc(exp: Expression): Int {
        return when (exp) {
            is Literal -> exp.value
            is Variable -> {
                // se constMemomry.get devolver nulo ---> tenta mutMemory, se for nulo ---> throw
                constMemory.get(exp.variableName)
                    ?: mutMemory[exp.variableName]
                    ?: throw RuntimeException("Erro: Variável '${exp.variableName}' não está definida!")
            }
            is BinaryExpression -> {
                val left = calc(exp.left)
                val right = calc(exp.right)

                when (exp.operator) {
                    Operator.PLUS -> left + right
                    Operator.MINUS -> left - right
                    Operator.TIMES -> left * right
                    Operator.DIVISION -> if (right != 0) left / right else throw RuntimeException("Divisão por zero!")
                    Operator.MODULE -> if (right != 0) left % right else throw RuntimeException("Divisão por zero!")
                    Operator.EQUALSTO -> if(left == right) 1 else 0
                    Operator.DIFFERENT -> if(left != right) 1 else 0
                    Operator.LESSTHEN -> if(left < right) 1 else 0
                    Operator.LESSOREQUALTO -> if(left <= right) 1 else 0
                    Operator.GREATERTHEN -> if(left > right) 1 else 0
                    Operator.GREATEROREQUALTO -> if(left >= right) 1 else 0
                }
            }
        }
    }

}
