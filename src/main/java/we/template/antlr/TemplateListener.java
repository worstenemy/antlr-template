// Generated from /Users/pxr/Desktop/antlr-template/src/main/java/we/template/Template.g4 by ANTLR 4.6
package we.template.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sBraced}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSBraced(TemplateParser.SBracedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sBraced}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSBraced(TemplateParser.SBracedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sText}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSText(TemplateParser.STextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sText}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSText(TemplateParser.STextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tSymbol}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterTSymbol(TemplateParser.TSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tSymbol}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitTSymbol(TemplateParser.TSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tPlain}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterTPlain(TemplateParser.TPlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tPlain}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitTPlain(TemplateParser.TPlainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(TemplateParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(TemplateParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#plain}.
	 * @param ctx the parse tree
	 */
	void enterPlain(TemplateParser.PlainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#plain}.
	 * @param ctx the parse tree
	 */
	void exitPlain(TemplateParser.PlainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#braced}.
	 * @param ctx the parse tree
	 */
	void enterBraced(TemplateParser.BracedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#braced}.
	 * @param ctx the parse tree
	 */
	void exitBraced(TemplateParser.BracedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sCall}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 */
	void enterSCall(TemplateParser.SCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sCall}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 */
	void exitSCall(TemplateParser.SCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sId}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 */
	void enterSId(TemplateParser.SIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sId}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 */
	void exitSId(TemplateParser.SIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tinyCall}.
	 * @param ctx the parse tree
	 */
	void enterTinyCall(TemplateParser.TinyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tinyCall}.
	 * @param ctx the parse tree
	 */
	void exitTinyCall(TemplateParser.TinyCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eCall}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void enterECall(TemplateParser.ECallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eCall}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void exitECall(TemplateParser.ECallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eId}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void enterEId(TemplateParser.EIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eId}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void exitEId(TemplateParser.EIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eInt}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void enterEInt(TemplateParser.EIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eInt}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void exitEInt(TemplateParser.EIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eStr}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void enterEStr(TemplateParser.EStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eStr}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 */
	void exitEStr(TemplateParser.EStrContext ctx);
}