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
    val inputJSONFile = args.get(args.indexOf("-i") + 1)
    val outputFile = args.get(args.indexOf("-o") + 1)


    val template = File(templateFile).readText()
    println("TEMPLATE:\n$template\n")

    val input = File(inputJSONFile).readText()
    println("INPUT JSON:\n$input\n")

    // FASE 2: CONSTRUÇÃO DO CONTEXTO DE DADOS
    // (O JSONVisitor será o responsável por converter a árvore num Map)
    // Para já preenchemos a estrutura "mockada" de parâmetros de input conforme as regras
    val globalContextParams = mutableListOf<Pair<String, Int>>()
    // (Aqui invocarias val jsonMap = JSONVisitor().visit(parser.json()) e transformavas num formato nativo)

    // Fallback de parse JSON simples / context:
    globalContextParams.add("a" to 2)

    // FASE 3: ANÁLISE DO TEMPLATE (Template Separator)
    val fragmentRegex = Regex("""\{\{(.*?)\}\}""", RegexOption.DOT_MATCHES_ALL)

    val staticParts = template.split(fragmentRegex)
    val scriptMatches = fragmentRegex.findAll(template).toList()

    // FASE 5: EXECUÇÃO E RENDERIZAÇÃO
    // Inicializar o StringBuilder
    val outputBuilder = StringBuilder()

    // Inicializar e configurar a memória base do interpreter
    val dummyScript = Script(emptyList(), emptyList())
    val interpreter = Interpreter(dummyScript)

    // Injetar contexto global (JSON input)
    globalContextParams.forEach { (key, value) ->
        interpreter.addConst(key, value)
    }

    // Processamento intercalado dos fragmentos
    for (i in staticParts.indices) {
        // Acrescentar Texto Estático
        outputBuilder.append(staticParts[i])

        // Acrescentar e Executar Bloco de Script (se existir)
        if (i < scriptMatches.size) {
            val scriptCode = scriptMatches[i].groupValues[1]

            // FASE 4: PARSING DOS SCRIPTS
            val scriptLexer = JavardairLexer(CharStreams.fromString(scriptCode))
            val scriptParser = JavardairParser(CommonTokenStream(scriptLexer))

            try {
                val astScript = scriptParser.script().toAST(globalContextParams.map { it.first })

                // Mudar o script atual do interpreter e prosseguir com as instruções
                interpreter.runScript(astScript, outputBuilder)
            } catch (e: Exception) {
                System.err.println("Erro ao processar bloco: $scriptCode -> ${e.message}")
            }
        }
    }

    // FASE 6: ESCRITA DO RESULTADO FINAL
    val finalOutput = outputBuilder.toString()
    File(outputFile).writeText(finalOutput)
    println("OUTPUT GERADO EM: $outputFile")
    println(finalOutput)
    println("DONE!")
}