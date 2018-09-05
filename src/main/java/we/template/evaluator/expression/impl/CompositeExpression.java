package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

import java.util.LinkedList;
import java.util.List;

public class CompositeExpression implements Expression {
	private final List<Expression> expressions = new LinkedList<>();

	public void addExpression(Expression e) {
		this.expressions.add(e);
	}

	@Override
	public String evaluate(EvaluationContext context) {
		StringBuilder builder = new StringBuilder(512);
		for (Expression e : this.expressions) {
			builder.append(e.evaluate(context));
		}
		return builder.toString();
	}
}