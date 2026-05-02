package org.example

import JavardairParser

fun JavardairParser.ScriptContext.toAST(parameters: List<String> = emptyList()): Script =
    Script(instruction().map { it.toAST() }, parameters)

fun JavardairParser.InstructionContext.toAST(): Instruction =
    when {
        controlstructure() != null -> controlstructure().toAST()
        assign() != null -> assign().toAST()
        print() != null -> print().toAST()
        break_() != null -> break_().toAST()
        else -> throw IllegalStateException("Unknown instruction type")
    }

fun JavardairParser.ControlstructureContext.toAST(): Instruction =
    when {
        ifelse() != null -> ifelse().toAST()
        while_() != null -> while_().toAST()
        else -> throw IllegalStateException("Unknown control structure type")
    }

fun JavardairParser.AssignContext.toAST(): Assign =
    Assign(TYPE().text, VARIABLE().text, expression().toAST())

fun JavardairParser.ExpressionContext.toAST(): Expression {
    val terms = term()
    val operators = OPERATOR()

    if (terms.size == 1) {
        return terms[0].toAST()
    }

    var result = terms[0].toAST()
    for (i in operators.indices) {
        val operator = operators[i].text.toOperator()
        val rightTerm = terms[i + 1].toAST()
        result = BinaryExpression(result, operator, rightTerm)
    }
    return result
}

fun JavardairParser.TermContext.toAST(): Expression =
    when {
        NUMBER() != null -> Literal(NUMBER().text.toInt())
        VARIABLE() != null -> Variable(VARIABLE().text)
        expression() != null -> expression().toAST()
        else -> throw IllegalStateException("Unknown term type")
    }

fun JavardairParser.PrintContext.toAST(): Print =
    Print(expression().toAST())

fun JavardairParser.BreakContext.toAST(): Break =
    Break()

fun JavardairParser.IfelseContext.toAST(): IfElse {
    val guard = guard().toAST()
    val allInstructions = instruction()
    val hasElse = CLOSEBRACKETS().size > 1

    val sequence: List<Instruction>
    val alternative: List<Instruction>?
    
    if (hasElse && elseSequence != null) {
        val ifEndIndex = allInstructions.indexOf(ifSequence)
        sequence = allInstructions.take(ifEndIndex + 1).map { it.toAST() }
        alternative = allInstructions.drop(ifEndIndex + 1).map { it.toAST() }
    } else {
        sequence = allInstructions.map { it.toAST() }
        alternative = null
    }

    return IfElse(guard, sequence, alternative)
}

fun JavardairParser.WhileContext.toAST(): While =
    While(guard().toAST(), instruction().map { it.toAST() })

fun JavardairParser.GuardContext.toAST(): Expression =
    expression().toAST()

fun String.toOperator(): Operator =
    when (this) {
        "+" -> Operator.PLUS
        "-" -> Operator.MINUS
        "*" -> Operator.TIMES
        "/" -> Operator.DIVISION
        "%" -> Operator.MODULE
        "==" -> Operator.EQUALSTO
        "!=" -> Operator.DIFFERENT
        "<" -> Operator.LESSTHEN
        "<=" -> Operator.LESSOREQUALTO
        ">" -> Operator.GREATERTHEN
        ">=" -> Operator.GREATEROREQUALTO
        else -> throw IllegalArgumentException("Unknown operator: $this")
    }
