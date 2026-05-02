package org.example
import JavardairLexer
import JavardairParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
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

    val codeStr = "mut b := 6 == 2;if (a < b) {print(1);}while (a == 1) {print(a);}"
    val parameters = listOf("a")

    val lexer = JavardairLexer(CharStreams.fromString(codeStr))
    val parser = JavardairParser(CommonTokenStream(lexer))
    val astScript = parser.script().toAST(parameters)
    Interpreter(astScript).run(listOf("a" to 2))

    //TODO
    /*
    val output: String = Convert(inputFile)
    println("OUTPUT:\n$output")

    File(outputFile).writeText(output)
    println("DONE!")
     */
}