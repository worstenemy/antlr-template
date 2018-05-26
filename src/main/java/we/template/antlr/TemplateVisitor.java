// Generated from /Users/pxr/Desktop/antlr-template/src/main/java/we/template/Template.g4 by ANTLR 4.6
package we.template.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sBraced}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSBraced(TemplateParser.SBracedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sText}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSText(TemplateParser.STextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tSymbol}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSymbol(TemplateParser.TSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tPlain}
	 * labeled alternative in {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPlain(TemplateParser.TPlainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(TemplateParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#plain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlain(TemplateParser.PlainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#braced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraced(TemplateParser.BracedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sId}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSId(TemplateParser.SIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sCall}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCall(TemplateParser.SCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sObject}
	 * labeled alternative in {@link TemplateParser#tinyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSObject(TemplateParser.SObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oCall}
	 * labeled alternative in {@link TemplateParser#tinyObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOCall(TemplateParser.OCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oAccess}
	 * labeled alternative in {@link TemplateParser#tinyObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOAccess(TemplateParser.OAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oSymbol}
	 * labeled alternative in {@link TemplateParser#tinyObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOSymbol(TemplateParser.OSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oNonArgCall}
	 * labeled alternative in {@link TemplateParser#tinyObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitONonArgCall(TemplateParser.ONonArgCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oArgCall}
	 * labeled alternative in {@link TemplateParser#tinyObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOArgCall(TemplateParser.OArgCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#tinyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyCall(TemplateParser.TinyCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eId}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEId(TemplateParser.EIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eInt}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEInt(TemplateParser.EIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eStr}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEStr(TemplateParser.EStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eObject}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEObject(TemplateParser.EObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eCall}
	 * labeled alternative in {@link TemplateParser#tinyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECall(TemplateParser.ECallContext ctx);
}