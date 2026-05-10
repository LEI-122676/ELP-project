// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#jvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJvalue(JSONParser.JvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#jfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJfield(JSONParser.JfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#jarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJarray(JSONParser.JarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#jobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobject(JSONParser.JobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#jnumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJnumber(JSONParser.JnumberContext ctx);
}