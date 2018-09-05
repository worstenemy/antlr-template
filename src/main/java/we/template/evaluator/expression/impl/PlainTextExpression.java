package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class PlainTextExpression implements Expression {
	private final String text;

	public PlainTextExpression(String text) {
		this.text = text;
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		return this.text;
	}
}