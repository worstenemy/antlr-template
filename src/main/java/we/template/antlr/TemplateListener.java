// Generated from C:/Users/Lenovo/Desktop/antlr-template/src/main/java/we/template\Template.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by the {@code bracedExpression}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBracedExpression(TemplateParser.BracedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracedExpression}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBracedExpression(TemplateParser.BracedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(TemplateParser.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(TemplateParser.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(TemplateParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(TemplateParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_arg}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void enterDsl_arg(TemplateParser.Dsl_argContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_arg}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void exitDsl_arg(TemplateParser.Dsl_argContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_call}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void enterDsl_call(TemplateParser.Dsl_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_call}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void exitDsl_call(TemplateParser.Dsl_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_access}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void enterDsl_access(TemplateParser.Dsl_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_access}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void exitDsl_access(TemplateParser.Dsl_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_notation}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void enterDsl_notation(TemplateParser.Dsl_notationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_notation}
	 * labeled alternative in {@link TemplateParser#dsl_braced}.
	 * @param ctx the parse tree
	 */
	void exitDsl_notation(TemplateParser.Dsl_notationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_methodInvoke}.
	 * @param ctx the parse tree
	 */
	void enterDsl_methodInvoke(TemplateParser.Dsl_methodInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_methodInvoke}.
	 * @param ctx the parse tree
	 */
	void exitDsl_methodInvoke(TemplateParser.Dsl_methodInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_methodName}.
	 * @param ctx the parse tree
	 */
	void enterDsl_methodName(TemplateParser.Dsl_methodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_methodName}.
	 * @param ctx the parse tree
	 */
	void exitDsl_methodName(TemplateParser.Dsl_methodNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_accessObjectField}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void enterDsl_accessObjectField(TemplateParser.Dsl_accessObjectFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_accessObjectField}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void exitDsl_accessObjectField(TemplateParser.Dsl_accessObjectFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_accessParam}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void enterDsl_accessParam(TemplateParser.Dsl_accessParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_accessParam}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void exitDsl_accessParam(TemplateParser.Dsl_accessParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_accessMethod}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void enterDsl_accessMethod(TemplateParser.Dsl_accessMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_accessMethod}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void exitDsl_accessMethod(TemplateParser.Dsl_accessMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_accessObjectMethod}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void enterDsl_accessObjectMethod(TemplateParser.Dsl_accessObjectMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_accessObjectMethod}
	 * labeled alternative in {@link TemplateParser#dsl_objectAccess}.
	 * @param ctx the parse tree
	 */
	void exitDsl_accessObjectMethod(TemplateParser.Dsl_accessObjectMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_field}.
	 * @param ctx the parse tree
	 */
	void enterDsl_field(TemplateParser.Dsl_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_field}.
	 * @param ctx the parse tree
	 */
	void exitDsl_field(TemplateParser.Dsl_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_expressions}.
	 * @param ctx the parse tree
	 */
	void enterDsl_expressions(TemplateParser.Dsl_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_expressions}.
	 * @param ctx the parse tree
	 */
	void exitDsl_expressions(TemplateParser.Dsl_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_paramExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void enterDsl_paramExpression(TemplateParser.Dsl_paramExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_paramExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void exitDsl_paramExpression(TemplateParser.Dsl_paramExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_literalExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void enterDsl_literalExpression(TemplateParser.Dsl_literalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_literalExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void exitDsl_literalExpression(TemplateParser.Dsl_literalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_objectExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void enterDsl_objectExpression(TemplateParser.Dsl_objectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_objectExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void exitDsl_objectExpression(TemplateParser.Dsl_objectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_methodInvokeExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void enterDsl_methodInvokeExpression(TemplateParser.Dsl_methodInvokeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_methodInvokeExpression}
	 * labeled alternative in {@link TemplateParser#dsl_expression}.
	 * @param ctx the parse tree
	 */
	void exitDsl_methodInvokeExpression(TemplateParser.Dsl_methodInvokeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_numberLiteral}
	 * labeled alternative in {@link TemplateParser#dsl_literal}.
	 * @param ctx the parse tree
	 */
	void enterDsl_numberLiteral(TemplateParser.Dsl_numberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_numberLiteral}
	 * labeled alternative in {@link TemplateParser#dsl_literal}.
	 * @param ctx the parse tree
	 */
	void exitDsl_numberLiteral(TemplateParser.Dsl_numberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsl_stringLiteral}
	 * labeled alternative in {@link TemplateParser#dsl_literal}.
	 * @param ctx the parse tree
	 */
	void enterDsl_stringLiteral(TemplateParser.Dsl_stringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsl_stringLiteral}
	 * labeled alternative in {@link TemplateParser#dsl_literal}.
	 * @param ctx the parse tree
	 */
	void exitDsl_stringLiteral(TemplateParser.Dsl_stringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_param}.
	 * @param ctx the parse tree
	 */
	void enterDsl_param(TemplateParser.Dsl_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_param}.
	 * @param ctx the parse tree
	 */
	void exitDsl_param(TemplateParser.Dsl_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_number}.
	 * @param ctx the parse tree
	 */
	void enterDsl_number(TemplateParser.Dsl_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_number}.
	 * @param ctx the parse tree
	 */
	void exitDsl_number(TemplateParser.Dsl_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_typedString}.
	 * @param ctx the parse tree
	 */
	void enterDsl_typedString(TemplateParser.Dsl_typedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_typedString}.
	 * @param ctx the parse tree
	 */
	void exitDsl_typedString(TemplateParser.Dsl_typedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#dsl_specialString}.
	 * @param ctx the parse tree
	 */
	void enterDsl_specialString(TemplateParser.Dsl_specialStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#dsl_specialString}.
	 * @param ctx the parse tree
	 */
	void exitDsl_specialString(TemplateParser.Dsl_specialStringContext ctx);
}