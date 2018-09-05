package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class ConcatExpression implements Expression {
	private final Expression left;

	private final Expression right;

	public ConcatExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		StringBuilder builder = new StringBuilder();
		builder.append(this.left.evaluate(context))
				.append(this.right.evaluate(context));
		return builder.toString();
	}
}