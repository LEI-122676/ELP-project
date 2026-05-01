// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSONParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSONParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#null}.
	 * @param ctx the parse tree
	 */
	void enterNull(JSONParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#null}.
	 * @param ctx the parse tree
	 */
	void exitNull(JSONParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(JSONParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(JSONParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JSONParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JSONParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JSONParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JSONParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
}