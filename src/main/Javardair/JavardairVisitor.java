// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/Javardair.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavardairParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavardairVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavardairParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(JavardairParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(JavardairParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#controlstructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlstructure(JavardairParser.ControlstructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JavardairParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavardairParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(JavardairParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(JavardairParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(JavardairParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(JavardairParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(JavardairParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavardairParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(JavardairParser.GuardContext ctx);
}