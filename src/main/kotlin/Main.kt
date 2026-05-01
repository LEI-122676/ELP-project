package org.example
import java.io.File

fun main(args: Array<String>) {
    // instancia template dado o argumento nome do ficheiro template


    if (args.isEmpty()) {
        println("error: esse comando não estáa certo")
        return
    }
    // engine.kt -f "template.txt" -i "input.json" -o "result.txt"
    if (args.size != 6) {
        println("error: not right amount of arguments")
        return
    }

    val template = args[args.indexOf("-f") + 1]
    val input = args.get(args.indexOf("-i") + 1)
    val output = args.get(args.indexOf("-o") + 1)

    //TODO
    val tempFile = File(template).readText()
    val inputFile = File(input).readText()
//    val outputFile = File(output).writeText("RESULTADO AQUI")

}