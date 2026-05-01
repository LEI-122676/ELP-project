package org.example
import java.io.File

//
fun main(args: Array<String>) {

    if (args.isEmpty() || args.size != 6) {
        throw IllegalArgumentException("Argumentos estão mal.\nExemplo: engine.kt -f template.txt -i input.json -o result.txt\n")
    }

    val template = args.get(args.indexOf("-f") + 1)
    val input = args.get(args.indexOf("-i") + 1)
    val output = args.get(args.indexOf("-o") + 1)

    //TODO
    val tempFile = File(template).readText()
    val inputFile = File(input).readText()
//    val outputFile = File(output).writeText("RESULTADO AQUI")

}