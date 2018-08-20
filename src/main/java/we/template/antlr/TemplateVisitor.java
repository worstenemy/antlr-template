// Generated from C:/Users/Lenovo/Desktop/antlr-template/src/main/java/we/template\Template.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by the {@code bracedExpression}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedExpression(TemplateParser.BracedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(TemplateParser.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(TemplateParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_arg}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_arg(TemplateParser.Dsl_argContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_call}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_call(TemplateParser.Dsl_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_access}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_access(TemplateParser.Dsl_accessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_notation}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_notation(TemplateParser.Dsl_notationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_methodInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_methodInvoke(TemplateParser.Dsl_methodInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_methodName(TemplateParser.Dsl_methodNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_accessObjectField}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_accessObjectField(TemplateParser.Dsl_accessObjectFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_accessParam}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_accessParam(TemplateParser.Dsl_accessParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_accessMethod}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_accessMethod(TemplateParser.Dsl_accessMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_accessObjectMethod}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_accessObjectMethod(TemplateParser.Dsl_accessObjectMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_field(TemplateParser.Dsl_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_expressions(TemplateParser.Dsl_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_paramExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_paramExpression(TemplateParser.Dsl_paramExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_literalExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_literalExpression(TemplateParser.Dsl_literalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_objectExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_objectExpression(TemplateParser.Dsl_objectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_methodInvokeExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_methodInvokeExpression(TemplateParser.Dsl_methodInvokeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_numberLiteral}
	 * labeled alternative in {@link TemplateParser#dsl_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_numberLiteral(TemplateParser.Dsl_numberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsl_stringLiteral}
	 * labeled alternative in {@link TemplateParser#dsl_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_stringLiteral(TemplateParser.Dsl_stringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_param(TemplateParser.Dsl_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_number(TemplateParser.Dsl_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_typedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_typedString(TemplateParser.Dsl_typedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#dsl_specialString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl_specialString(TemplateParser.Dsl_specialStringContext ctx);
}