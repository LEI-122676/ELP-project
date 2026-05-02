package org.example
import java.io.File

// engine.kt -f src/test/testFiles/template1.html -i src/test/testFiles/input1.json -o src/test/testFiles/output1.html
fun main(args: Array<String>) {
    if (args.isEmpty() || args.size != 6)
        throw IllegalArgumentException("Argumentos estão mal.\nExemplo: engine.kt -f template.txt -i input.json -o result.txt\n")


    val templateFile = args.get(args.indexOf("-f") + 1)
    val inputFile = args.get(args.indexOf("-i") + 1)
    val outputFile = args.get(args.indexOf("-o") + 1)


    val template = File(templateFile).readText()
    println("TEMPLATE:\n$template\n")

    val input = File(inputFile).readText()
    println("INPUT:\n$input\n")

    //TODO
    /*
    val output: String = Convert(inputFile)
    println("OUTPUT:\n$output")

    File(outputFile).writeText(output)
    println("DONE!")
     */
}