package we.template.evaluator.expression.impl;

import we.template.evaluator.exceptions.EvaluateException;
import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class IdExpression implements Expression {
	private final String id;

	public IdExpression(String id) {
		this.id = id;
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		Object result = context.getParameter(this.id);
		if (null == result) {
			throw new EvaluateException("can't resolve parameter " + this.id);
		}
		return result;
	}
}