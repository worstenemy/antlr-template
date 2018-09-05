package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class NumberExpression implements Expression {
	private final int number;

	public NumberExpression(String number) {
		this.number = Integer.parseInt(number);
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		return this.number;
	}
}