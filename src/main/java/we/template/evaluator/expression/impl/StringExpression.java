package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class StringExpression implements Expression {
	private final String string;

	public StringExpression(String string) {
		if (null != string) {
			this.string = string.replace("\"", "");
		} else {
			this.string = null;
		}
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		return this.string;
	}
}