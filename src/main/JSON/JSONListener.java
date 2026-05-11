// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#jvalue}.
	 * @param ctx the parse tree
	 */
	void enterJvalue(JSONParser.JvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#jvalue}.
	 * @param ctx the parse tree
	 */
	void exitJvalue(JSONParser.JvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#jfield}.
	 * @param ctx the parse tree
	 */
	void enterJfield(JSONParser.JfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#jfield}.
	 * @param ctx the parse tree
	 */
	void exitJfield(JSONParser.JfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#jarray}.
	 * @param ctx the parse tree
	 */
	void enterJarray(JSONParser.JarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#jarray}.
	 * @param ctx the parse tree
	 */
	void exitJarray(JSONParser.JarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#jobject}.
	 * @param ctx the parse tree
	 */
	void enterJobject(JSONParser.JobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#jobject}.
	 * @param ctx the parse tree
	 */
	void exitJobject(JSONParser.JobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#jnumber}.
	 * @param ctx the parse tree
	 */
	void enterJnumber(JSONParser.JnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#jnumber}.
	 * @param ctx the parse tree
	 */
	void exitJnumber(JSONParser.JnumberContext ctx);
}