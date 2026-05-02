// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/Javardair.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavardairParser}.
 */
public interface JavardairListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavardairParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(JavardairParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(JavardairParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(JavardairParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(JavardairParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#controlstructure}.
	 * @param ctx the parse tree
	 */
	void enterControlstructure(JavardairParser.ControlstructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#controlstructure}.
	 * @param ctx the parse tree
	 */
	void exitControlstructure(JavardairParser.ControlstructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JavardairParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JavardairParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavardairParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavardairParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavardairParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavardairParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(JavardairParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(JavardairParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JavardairParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JavardairParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(JavardairParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(JavardairParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(JavardairParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(JavardairParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(JavardairParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(JavardairParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavardairParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(JavardairParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavardairParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(JavardairParser.GuardContext ctx);
}