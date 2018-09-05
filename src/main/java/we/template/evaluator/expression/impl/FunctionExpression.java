package we.template.evaluator.expression.impl;

import we.template.evaluator.exceptions.EvaluateException;
import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;
import we.template.evaluator.function.Function;

import java.util.List;

public class FunctionExpression implements Expression {
	private final String name;

	private final List<Expression> parameters;

	public FunctionExpression(String name, List<Expression> parameters) {
		this.name = name;
		this.parameters = parameters;
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		Object[] evaluatedParameters = null;
		if (null != this.parameters) {
			evaluatedParameters = new Object[this.parameters.size()];
			for (int i = 0; i < evaluatedParameters.length; ++i) {
				Expression e = this.parameters.get(i);
				evaluatedParameters[i] = e.evaluate(context);
			}
		}
		Function function = context.getFunction(this.name, evaluatedParameters);
		if (null == function) {
			throw new EvaluateException("can't resolve function " + this.name);
		}
		return function.call(evaluatedParameters);
	}
}