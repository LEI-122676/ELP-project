package org.example
import JavardairLexer
import JavardairParser
import WriteOnceMap
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


class JavardairTest {

    // ─────────────────────────────────────────────────────────────
    // Helpers
    // ─────────────────────────────────────────────────────────────

    /** Cria um intérprete com um script vazio. */
    private fun emptyInterpreter(): Interpreter =
        Interpreter(Script(emptyList(), emptyList()))

    /** Executa código Javardair e devolve o output como String. */
    private fun runCode(
        code: String,
        params: List<String> = emptyList(),
        context: Map<String, Any?> = emptyMap()
    ): String {
        val lexer  = JavardairLexer(CharStreams.fromString(code))
        val parser = JavardairParser(CommonTokenStream(lexer))
        val script = parser.script().toAST(params)

        val interp = emptyInterpreter()
        context.forEach { (k, v) -> interp.addConst(k, v) }

        val sb = StringBuilder()
        interp.runScript(script, sb)
        return sb.toString().trimEnd('\n')
    }

    /**
     * Simula o motor de templates completo (equivalente ao renderTemplate de Main.kt),
     * mas inline para os testes.
     */
    private fun renderTemplate(template: String, jsonInput: String): String {
        // Aproveita o contexto JSON que já tens criado em Main.kt
        val globalContext = buildGlobalContext(jsonInput)

        // Renderiza e devolve o template (que também já existe em Main.kt)
        return renderTemplate(template, globalContext)
    }

    // INTERPRETADOR

    // ── 1.1 Expressões aritméticas ────────────────────────────────

    @Test fun `INTERPRETADOR calc - soma de literais`() {
        val interp = emptyInterpreter()
        val expr = BinaryExpression(Literal(3), Operator.PLUS, Literal(4))
        assertEquals(7, interp.calc(expr))
    }

    @Test fun `INTERPRETADOR calc - subtracao`() {
        val interp = emptyInterpreter()
        assertEquals(1, interp.calc(BinaryExpression(Literal(5), Operator.MINUS, Literal(4))))
    }

    @Test fun `INTERPRETADOR calc - multiplicacao`() {
        val interp = emptyInterpreter()
        assertEquals(12, interp.calc(BinaryExpression(Literal(3), Operator.TIMES, Literal(4))))
    }

    @Test fun `INTERPRETADOR calc - divisao`() {
        val interp = emptyInterpreter()
        assertEquals(3, interp.calc(BinaryExpression(Literal(9), Operator.DIVISION, Literal(3))))
    }

    @Test fun `INTERPRETADOR calc - modulo`() {
        val interp = emptyInterpreter()
        assertEquals(1, interp.calc(BinaryExpression(Literal(7), Operator.MODULE, Literal(3))))
    }

    @Test fun `INTERPRETADOR calc - divisao por zero lanca excecao`() {
        val interp = emptyInterpreter()
        assertThrows<RuntimeException> {
            interp.calc(BinaryExpression(Literal(5), Operator.DIVISION, Literal(0)))
        }
    }

    @Test fun `INTERPRETADOR calc - modulo por zero lanca excecao`() {
        val interp = emptyInterpreter()
        assertThrows<RuntimeException> {
            interp.calc(BinaryExpression(Literal(5), Operator.MODULE, Literal(0)))
        }
    }

    @Test fun `INTERPRETADOR calc - expressao aritmetica encadeada`() {
        // (2 + 3) * 4  → avaliação esquerda para direita sem precedência própria
        val interp = emptyInterpreter()
        val inner = BinaryExpression(Literal(2), Operator.PLUS, Literal(3))
        val outer = BinaryExpression(inner, Operator.TIMES, Literal(4))
        assertEquals(20, interp.calc(outer))
    }

    // ── 1.2 Expressões booleanas / comparação ────────────────────

    @Test fun `INTERPRETADOR calc - igualdade verdadeira`() {
        val interp = emptyInterpreter()
        assertEquals(1, interp.calc(BinaryExpression(Literal(5), Operator.EQUALSTO, Literal(5))))
    }

    @Test fun `INTERPRETADOR calc - igualdade falsa`() {
        val interp = emptyInterpreter()
        assertEquals(0, interp.calc(BinaryExpression(Literal(5), Operator.EQUALSTO, Literal(6))))
    }

    @Test fun `INTERPRETADOR calc - diferente`() {
        val interp = emptyInterpreter()
        assertEquals(1, interp.calc(BinaryExpression(Literal(3), Operator.DIFFERENT, Literal(4))))
    }

    @Test fun `INTERPRETADOR calc - menor que verdadeiro`() {
        val interp = emptyInterpreter()
        assertEquals(1, interp.calc(BinaryExpression(Literal(2), Operator.LESSTHEN, Literal(5))))
    }

    @Test fun `INTERPRETADOR calc - maior ou igual verdadeiro`() {
        val interp = emptyInterpreter()
        assertEquals(1, interp.calc(BinaryExpression(Literal(5), Operator.GREATEROREQUALTO, Literal(5))))
    }

    // ── 1.3 Concatenação de strings ──────────────────────────────

    @Test fun `INTERPRETADOR calc - concatenacao de strings`() {
        val interp = emptyInterpreter()
        val expr = BinaryExpression(StringLiteral("Olá "), Operator.PLUS, StringLiteral("mundo"))
        assertEquals("Olá mundo", interp.calc(expr))
    }

    @Test fun `INTERPRETADOR calc - concatenacao string com numero`() {
        val interp = emptyInterpreter()
        val expr = BinaryExpression(StringLiteral("v"), Operator.PLUS, Literal(2))
        assertEquals("v2", interp.calc(expr))
    }

    // ── 1.4 Variáveis mutable e const ────────────────────────────

    @Test fun `INTERPRETADOR addConst e calc - acesso a constante`() {
        val interp = emptyInterpreter()
        interp.addConst("nome", "Javardair")
        assertEquals("Javardair", interp.calc(Variable(listOf("nome"))))
    }

    @Test fun `INTERPRETADOR addConst - nao sobrescreve constante existente`() {
        val interp = emptyInterpreter()
        interp.addConst("x", 10)
        interp.addConst("x", 99)          // segunda chamada deve ser ignorada
        assertEquals(10, interp.calc(Variable(listOf("x"))))
    }

    @Test fun `INTERPRETADOR calc - variavel nao definida lanca excecao`() {
        val interp = emptyInterpreter()
        assertThrows<RuntimeException> {
            interp.calc(Variable(listOf("indefinida")))
        }
    }

    // ── 1.5 Print (via runScript) ────────────────────────────────

    @Test fun `INTERPRETADOR print - literal numerico`() {
        val script = Script(listOf(Print(Literal(42))), emptyList())
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("42", sb.toString().trim())
    }

    @Test fun `INTERPRETADOR print - string literal`() {
        val script = Script(listOf(Print(StringLiteral("ola"))), emptyList())
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("ola", sb.toString().trim())
    }

    // ── 1.6 Assign + acesso a variável ───────────────────────────

    @Test fun `INTERPRETADOR assign mut e print`() {
        val script = Script(
            listOf(
                Assign(Type.MUTABLE, "x", Literal(7)),
                Print(Variable(listOf("x")))
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("7", sb.toString().trim())
    }

    @Test fun `INTERPRETADOR assign const nao pode ser reatribuida`() {
        val script = Script(
            listOf(
                Assign(Type.CONSTANT, "c", Literal(1)),
                Assign(Type.CONSTANT, "c", Literal(2))   // deve lançar exceção
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        assertThrows<RuntimeException> {
            interp.runScript(script, StringBuilder())
        }
    }

    @Test fun `INTERPRETADOR assign mut pode ser reatribuida`() {
        val script = Script(
            listOf(
                Assign(Type.MUTABLE, "n", Literal(1)),
                Assign(Type.MUTABLE, "n", Literal(2)),
                Print(Variable(listOf("n")))
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("2", sb.toString().trim())
    }

    // ── 1.7 If-Else ──────────────────────────────────────────────

    @Test fun `INTERPRETADOR ifelse - ramo then executado`() {
        val script = Script(
            listOf(
                IfElse(
                    BinaryExpression(Literal(1), Operator.EQUALSTO, Literal(1)),
                    listOf(Print(StringLiteral("sim"))),
                    listOf(Print(StringLiteral("nao")))
                )
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("sim", sb.toString().trim())
    }

    @Test fun `INTERPRETADOR ifelse - ramo else executado`() {
        val script = Script(
            listOf(
                IfElse(
                    BinaryExpression(Literal(1), Operator.EQUALSTO, Literal(2)),
                    listOf(Print(StringLiteral("sim"))),
                    listOf(Print(StringLiteral("nao")))
                )
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("nao", sb.toString().trim())
    }

    @Test fun `INTERPRETADOR ifelse - sem else e guarda falsa nao imprime nada`() {
        val script = Script(
            listOf(
                IfElse(
                    BinaryExpression(Literal(0), Operator.EQUALSTO, Literal(1)),
                    listOf(Print(StringLiteral("nunca")))
                )
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        val sb = StringBuilder()
        interp.runScript(script, sb)
        assertEquals("", sb.toString().trim())
    }

    // ── 1.8 ForLoop ──────────────────────────────────────────────

    @Test fun `INTERPRETADOR forloop - itera lista`() {
        val interp = emptyInterpreter()
        interp.addConst("lista", listOf("a", "b", "c"))

        val script = Script(
            listOf(
                ForLoop(
                    "i",
                    Variable(listOf("lista")),
                    listOf(Print(Variable(listOf("i"))))
                )
            ),
            listOf("lista")
        )
        val sb = StringBuilder()
        interp.runScript(script, sb)
        // itera sobre os índices (0,1,2)
        assertEquals("0\n1\n2", sb.toString().trim())
    }

    @Test fun `INTERPRETADOR forloop - itera mapa`() {
        val interp = emptyInterpreter()
        interp.addConst("obj", mapOf("a" to 1, "b" to 2))

        val script = Script(
            listOf(
                ForLoop(
                    "k",
                    Variable(listOf("obj")),
                    listOf(Print(Variable(listOf("k"))))
                )
            ),
            listOf("obj")
        )
        val sb = StringBuilder()
        interp.runScript(script, sb)
        val lines = sb.toString().trim().lines().toSet()
        assertEquals(setOf("a", "b"), lines)
    }

    @Test fun `INTERPRETADOR forloop - break termina ciclo`() {
        val interp = emptyInterpreter()
        interp.addConst("lista", listOf(10, 20, 30, 40))

        val script = Script(
            listOf(
                ForLoop(
                    "i",
                    Variable(listOf("lista")),
                    listOf(
                        Print(Variable(listOf("i"))),
                        Break()
                    )
                )
            ),
            listOf("lista")
        )
        val sb = StringBuilder()
        interp.runScript(script, sb)
        // Apenas o primeiro índice deve ser impresso
        assertEquals("0", sb.toString().trim())
    }


    // 2. TESTES DE PARSING (ANTLR → AST)


    @Test fun `parsing - print de numero`() {
        assertEquals("42", runCode("print (42)."))
    }

    @Test fun `parsing - print de string`() {
        assertEquals("ola", runCode("""print ("ola")."""))
    }

    @Test fun `parsing - assign mut e print`() {
        assertEquals("10", runCode("mut x := 10.\nprint (x)."))
    }

    @Test fun `parsing - assign const e print`() {
        assertEquals("5", runCode("const c := 5.\nprint (c)."))
    }

    @Test fun `parsing - expressao aritmetica simples`() {
        assertEquals("9", runCode("print (4 + 5)."))
    }

    @Test fun `parsing - expressao com variavel`() {
        assertEquals("7", runCode("mut a := 3.\nprint (a + 4)."))
    }

    @Test fun `parsing - if verdadeiro`() {
        assertEquals("ok", runCode("""if (1 == 1) << print "ok". >>"""))
    }

    @Test fun `parsing - if falso com else`() {
        assertEquals("nao", runCode("""if (1 == 2) << print ("sim"). >> else << print ("nao"). >>"""))
    }

    @Test fun `parsing - for loop com lista `() {
        val output = runCode(
            "for (i >>> items) << print (i). >>",
            params = listOf("items"),
            context = mapOf("items" to listOf("x", "y", "z"))
        )
        // O for itera sobre os índices 0,1,2
        assertEquals("0\n1\n2", output)
    }

    @Test fun `parsing - acesso a propriedade de mapa`() {
        val output = runCode(
            "print (dados..nome).",
            params = listOf("dados"),
            context = mapOf("dados" to mapOf("nome" to "Ana"))
        )
        assertEquals("Ana", output)
    }

    @Test fun `parsing - comparacao menor que`() {
        assertEquals("menor", runCode("""
            mut a := 3.
            if (a < 5) <<
                print "menor".
            >> else <<
                print "maior".
            >>
        """.trimIndent()))
    }

    @Test fun `parsing - comentario e ignorado`() {
        assertEquals("42", runCode("### isto é um comentário\nprint 42."))
    }

    @Test fun `parsing - multiplos prints`() {
        val out = runCode("""
            print 1.
            print 2.
            print 3.
        """.trimIndent())
        assertEquals("1\n2\n3", out)
    }

    @Test fun `parsing - variavel declarada num bloco acessivel no seguinte`() {
        // Simula dois blocos de script no mesmo interpretador
        val interp = emptyInterpreter()

        // Bloco 1: declara variável
        fun exec(code: String, defined: List<String>): String {
            val lexer  = JavardairLexer(CharStreams.fromString(code))
            val parser = JavardairParser(CommonTokenStream(lexer))
            val script = parser.script().toAST(defined)
            val sb = StringBuilder()
            interp.runScript(script, sb)
            return sb.toString().trim()
        }

        exec("mut contador := 10.", emptyList())
        val out = exec("print contador.", listOf("contador"))
        assertEquals("10", out)
    }
    @Test fun `parsing (sem interp) - variavel declarada num bloco acessivel no seguinte`() {
        // Simula dois blocos de script no mesmo interpretador
        val interp = emptyInterpreter()

        // Bloco 1: declara variável
        fun exec(code: String, defined: List<String>): String {
            val lexer  = JavardairLexer(CharStreams.fromString(code))
            val parser = JavardairParser(CommonTokenStream(lexer))
            val script = parser.script().toAST(defined)
            val sb = StringBuilder()
            interp.runScript(script, sb)
            return sb.toString().trim()
        }

        exec("mut contador := 10.", emptyList())
        val out = exec("print contador.", listOf("contador"))
        assertEquals("10", out)
    }


    // 3. TESTES DE INTEGRAÇÃO (Template Engine end-to-end)


    @Test fun `integracao - substituicao simples de variavel`() {
        val template = "<h1>{{ print nome. }}</h1>"
        val json     = """{"nome": "Javardair"}"""
        val output   = renderTemplate(template, json)
        assertEquals("<h1>Javardair\n</h1>", output)
    }

    @Test fun `integracao - multiplas substituicoes`() {
        val template = "{{ print saudacao. }} {{ print alvo. }}"
        val json     = """{"saudacao": "Olá", "alvo": "mundo"}"""
        val output   = renderTemplate(template, json)
        assertEquals("Olá\n mundo\n", output)
    }

    @Test fun `integracao - condicional com propriedade JSON`() {
        val template = """{{ if (ativo == 1) << print("ligado"). >> else << print("desligado"). >> }}"""
        val json1 = """{"ativo": 1}"""
        val json2 = """{"ativo": 0}"""

        assertEquals("ligado\n",    renderTemplate(template, json1))
        assertEquals("desligado\n", renderTemplate(template, json2))
    }

    @Test fun `integracao - for loop sobre array JSON`() {
        val template = """{{ for (i >>> frutas) << print i. >> }}"""
        val json     = """{"frutas": ["maca", "pera", "uva"]}"""
        val output   = renderTemplate(template, json)
        // Itera sobre índices 0,1,2
        assertEquals("0\n1\n2\n", output)
    }

    @Test fun `integracao - acesso a subpropriedade JSON`() {
        val template = """{{ print pessoa..cidade. }}"""
        val json     = """{"pessoa": {"cidade": "Lisboa"}}"""
        assertEquals("Lisboa\n", renderTemplate(template, json))
    }

    @Test fun `integracao - conteudo estatico preservado`() {
        val template = "<html>\n{{ print titulo. }}\n</html>"
        val json     = """{"titulo": "Bem-vindo"}"""
        val output   = renderTemplate(template, json)
        assertTrue(output.contains("<html>"))
        assertTrue(output.contains("</html>"))
        assertTrue(output.contains("Bem-vindo"))
    }

    @Test fun `integracao - variavel declarada em bloco persistente noutro bloco`() {
        val template = "{{ const cnt := 5. }}{{ print (cnt). }}"
        val json     = """{}"""
        val output   = renderTemplate(template, json)
        assertEquals("5\n", output)
    }

    @Test fun `integracao - aritmetica no template`() {
        val template = """{{ print (base + 10). }}"""
        val json     = """{"base": 5}"""
        val output   = renderTemplate(template, json)
        assertEquals("15\n", output)
    }


    // 4. TESTES DE VALIDAÇÃO / ERROS


    @Test fun `validacao - variavel nao definida retorna erro`() {
        val script = Script(
            listOf(Print(Variable(listOf("x")))),
            emptyList()
        )
        val erros = script.validate()
        assertTrue(erros.isNotEmpty(), "Devia reportar erro para variável 'x' não definida")
    }

    @Test fun `validacao - variavel definida sem erros`() {
        val script = Script(
            listOf(
                Assign(Type.MUTABLE, "x", Literal(1)),
                Print(Variable(listOf("x")))
            ),
            emptyList()
        )
        assertEquals(emptyList<VarError>(), script.validate())
    }

    @Test fun `validacao - break fora de for reporta erro`() {
        val script = Script(listOf(Break()), emptyList())
        val erros = script.validate()
        assertTrue(erros.any { it.varId.contains("break", ignoreCase = true) })
    }

    @Test fun `validacao - break dentro de for sem erros`() {
        val script = Script(
            listOf(
                Assign(Type.MUTABLE, "lista", Literal(0)),   // placeholder
                ForLoop(
                    "i",
                    Variable(listOf("lista")),
                    listOf(Break())
                )
            ),
            listOf("lista")
        )
        val erros = script.validate()
        assertTrue(erros.none { it.varId.contains("break", ignoreCase = true) })
    }

    @Test fun `validacao - parametro declarado nao gera erro`() {
        val script = Script(
            listOf(Print(Variable(listOf("param")))),
            listOf("param")
        )
        assertEquals(emptyList<VarError>(), script.validate())
    }

    @Test fun `runtime - const nao pode ser redeclarada como mut`() {
        val script = Script(
            listOf(
                Assign(Type.CONSTANT,  "k", Literal(1)),
                Assign(Type.MUTABLE,   "k", Literal(2))
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        assertThrows<RuntimeException> {
            interp.runScript(script, StringBuilder())
        }
    }

    // 5. TESTES COMPOUND ASSIGN  (x += expr  →  x := x op expr)

    // ── 5.1 Operadores numéricos básicos ─────────────────────────

    @Test fun `compound assign - += acumula valor`() {
        assertEquals("8", runCode("""
            mut x := 5.
            x += 3.
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - -= subtrai valor`() {
        assertEquals("6", runCode("""
            mut x := 10.
            x -= 4.
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - *= multiplica valor`() {
        assertEquals("15", runCode("""
            mut x := 3.
            x *= 5.
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - div= divide valor`() {
        assertEquals("4", runCode("""
            mut x := 12.
            x /= 3.
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - mod= aplica modulo`() {
        assertEquals("1", runCode("""
            mut x := 7.
            x %= 3.
            print x.
        """.trimIndent()))
    }

    // ── 5.2 Acumulações múltiplas ─────────────────────────────────

    @Test fun `compound assign - multiplos += acumulam corretamente`() {
        assertEquals("10", runCode("""
            mut x := 0.
            x += 3.
            x += 3.
            x += 4.
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - mistura de operadores`() {
        // x = 10, x += 5 → 15, x -= 3 → 12, x *= 2 → 24
        assertEquals("24", runCode("""
            mut x := 10.
            x += 5.
            x -= 3.
            x *= 2.
            print x.
        """.trimIndent()))
    }

    // ── 5.3 Com expressões no lado direito ────────────────────────

    @Test fun `compound assign - lado direito e expressao aritmetica`() {
        assertEquals("11", runCode("""
            mut x := 5.
            x += 3 + 3.
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - lado direito e outra variavel`() {
        assertEquals("9", runCode("""
            mut x := 4.
            mut y := 5.
            x += y.
            print x.
        """.trimIndent()))
    }

    // ── 5.4 Concatenação de strings com += ───────────────────────

    @Test fun `compound assign - += concatena strings`() {
        assertEquals("olá mundo", runCode("""
            mut s := "olá ".
            s += "mundo".
            print s.
        """.trimIndent()))
    }

    @Test fun `compound assign - += concatena string com numero`() {
        assertEquals("item3", runCode("""
            mut s := "item".
            s += 3.
            print s.
        """.trimIndent()))
    }

    // ── 5.5 Dentro de estruturas de controlo ─────────────────────

    @Test fun `compound assign - += dentro de for conta iteracoes`() {
        assertEquals("3", runCode(
            """
            mut count := 0.
            for (i >>> lista) <<
                count += 1.
            >>
            print count.
            """.trimIndent(),
            params  = listOf("lista"),
            context = mapOf("lista" to listOf("a", "b", "c"))
        ))
    }

    @Test fun `compound assign - += dentro de if so executa quando condicao verdadeira`() {
        assertEquals("15", runCode("""
            mut x := 10.
            if (x == 10) <<
                x += 5.
            >>
            print x.
        """.trimIndent()))
    }

    @Test fun `compound assign - += nao executa quando if falso`() {
        assertEquals("10", runCode("""
            mut x := 10.
            if (x == 99) <<
                x += 5.
            >>
            print x.
        """.trimIndent()))
    }

    // ── 5.6 Casos de erro ────────────────────────────────────────

    @Test fun `INTERPRETADOR compound assign - em constante lanca excecao`() {
        // const não pode ser reatribuída, logo compound assign também falha
        val script = Script(
            listOf(
                Assign(Type.CONSTANT, "c", Literal(5)),
                // desaçucara para: Assign(MUTABLE, "c", BinaryExpression(Variable("c"), PLUS, Literal(1)))
                // mas o interpretador recusa reatribuir uma const como mut
                Assign(Type.MUTABLE, "c", BinaryExpression(Variable(listOf("c")), Operator.PLUS, Literal(1)))
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        assertThrows<RuntimeException> {
            interp.runScript(script, StringBuilder())
        }
    }

    @Test fun `INTERPRETADOR compound assign - em variavel nao definida lanca excecao`() {
        // z nunca foi declarada; Variable("z") lança RuntimeException no calc
        val script = Script(
            listOf(
                Assign(Type.MUTABLE, "z",
                    BinaryExpression(Variable(listOf("z")), Operator.PLUS, Literal(1)))
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        assertThrows<RuntimeException> {
            interp.runScript(script, StringBuilder())
        }
    }

    @Test fun `INTERPRETADOR compound assign - divisao por zero lanca excecao`() {
        val script = Script(
            listOf(
                Assign(Type.MUTABLE, "x", Literal(10)),
                Assign(Type.MUTABLE, "x",
                    BinaryExpression(Variable(listOf("x")), Operator.DIVISION, Literal(0)))
            ),
            emptyList()
        )
        val interp = Interpreter(script)
        assertThrows<RuntimeException> {
            interp.runScript(script, StringBuilder())
        }
    }

}