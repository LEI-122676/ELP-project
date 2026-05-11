package org.example

import JavardairLexer
import JavardairParser
import JSONLexer
import JSONParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

// engine.kt -f src/test/testFiles/template1.html -i src/test/testFiles/input1.json -o src/test/testFiles/output1.html
fun main(args: Array<String>) {
    if (args.isEmpty() || args.size != 6)
        throw IllegalArgumentException("Argumentos inválidos.\nUso esperado: engine.kt -f <template> -i <input.json> -o <resultado>\n")

    val templateFile = args[args.indexOf("-f") + 1]
    val inputJSONFile = args[args.indexOf("-i") + 1]
    val outputFile = args[args.indexOf("-o") + 1]

    val input = File(inputJSONFile).readText()
    val template = File(templateFile).readText()

    println("---------> INPUT JSON:\n$input\n")
    println("---------> TEMPLATE:\n$template\n")

    val globalContext = buildGlobalContext(input)
    val finalOutput = renderTemplate(template, globalContext)

    File(outputFile).writeText(finalOutput)
    
    println("----------> GERADO OUTPUT:\n$finalOutput\n")
}

/**
 * FASE 2: Parsing de JSON para obter os argumentos/Variáveis globais
 */
private fun buildGlobalContext(jsonString: String): Map<String, Any?> {
    val lexer = JSONLexer(CharStreams.fromString(jsonString))
    val parser = JSONParser(CommonTokenStream(lexer))
    // Iniciamos no 'value' de topo
    val jsonAst = parser.jvalue()

    val result = visitJSONValue(jsonAst)
    return if (result is Map<*, *>) {
        result as Map<String, Any?>
    } else {
        emptyMap()
    }
}

// Funções de Visita simples adaptadas para o JSONParser gerado em Java
private fun visitJSONValue(ctx: JSONParser.JvalueContext): Any? {
    if (ctx.jobject() != null) return visitJSONObject(ctx.jobject())
    if (ctx.jarray() != null) return visitJSONArray(ctx.jarray())
    if (ctx.JSTRING() != null) return ctx.JSTRING().text.removeSurrounding("\"")
    if (ctx.jnumber() != null) return ctx.jnumber().text.toIntOrNull() ?: ctx.jnumber().text.toDoubleOrNull()
    if (ctx.text == "true") return true
    if (ctx.text == "false") return false
    return null
}

private fun visitJSONObject(ctx: JSONParser.JobjectContext): Map<String, Any?> {
    val map = mutableMapOf<String, Any?>()
    for (pairCtx in ctx.jfield()) {
        val key = pairCtx.JSTRING().text.removeSurrounding("\"")
        val value = visitJSONValue(pairCtx.jvalue())
        map[key] = value
    }
    return map
}

private fun visitJSONArray(ctx: JSONParser.JarrayContext): List<Any?> {
    return ctx.jvalue().map { visitJSONValue(it) }
}

/**
 * FASE 3 a 5: Renderização onde é processado os Templates Estáticos VS Blocos de Script
 */
private fun renderTemplate(template: String, globalContext: Map<String, Any?>): String {
    val fragmentRegex = Regex("""\{\{(.*?)\}\}""", RegexOption.DOT_MATCHES_ALL)
    
    val staticParts = template.split(fragmentRegex)
    val scriptMatches = fragmentRegex.findAll(template).toList()

    val outputBuilder = StringBuilder()

    val dummyScript = Script(emptyList(), emptyList())
    val interpreter = Interpreter(dummyScript)

    // Injetar contexto global para dentro da memória do interpretador
    globalContext.forEach { (key, value) ->
        interpreter.addConst(key, value)
    }

    // Listar o nome das variaveis do contexto global a serem injetadas dentro da AST do próprio Javardair
    val definedVariableNames = globalContext.keys.toList()

    for (i in staticParts.indices) {
        // Parte Normal Estática
        outputBuilder.append(staticParts[i])

        // Parse e Eval de blocos Script Javardair se existirem
        if (i < scriptMatches.size) {
            val scriptCode = scriptMatches[i].groupValues[1]
            executeJavardairScript(scriptCode, definedVariableNames, interpreter, outputBuilder)
        }
    }

    return outputBuilder.toString()
}

/**
 * Encapsula a invocação do compilador e Interpretador da AST
 */
private fun executeJavardairScript(
    scriptCode: String,
    definedParameters: List<String>,
    interpreter: Interpreter,
    outputBuilder: StringBuilder
) {
    try {
        val scriptLexer = JavardairLexer(CharStreams.fromString(scriptCode))
        val scriptParser = JavardairParser(CommonTokenStream(scriptLexer))

        val astScript = scriptParser.script().toAST(definedParameters)
        interpreter.runScript(astScript, outputBuilder)
    } catch (e: Exception) {
        System.err.println("❌ Erro de compilação ou execução num bloco do Template!\nConteúdo que falhou:\n$scriptCode\nErro: ${e.message}")
    }
}