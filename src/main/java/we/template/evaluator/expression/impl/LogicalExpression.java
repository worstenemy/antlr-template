package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class LogicalExpression implements Expression {
	public enum LogicOperator {
		and {
			@Override
			Boolean evaluate(Boolean left, Boolean right) {
				return left && right ? Boolean.TRUE : Boolean.FALSE;
			}
		},
		or {
			@Override
			Boolean evaluate(Boolean left, Boolean right) {
				return left || right ? Boolean.TRUE : Boolean.FALSE;
			}
		};

		Boolean evaluate(Expression left, Expression right, EvaluationContext context) {
			if (null == left || null == right) {
				throw new IllegalArgumentException("can't compare with null value");
			}
			Object first = left.evaluate(context);
			Object second = right.evaluate(context);
			if (null == first || null == second) {
				throw new IllegalArgumentException("can't compare with null value");
			}
			return evaluate(Boolean.class.cast(first), Boolean.class.cast(second));
		}

		abstract Boolean evaluate(Boolean left, Boolean right);
	}

	private final Expression left;

	private final Expression right;

	private final LogicOperator operator;

	public LogicalExpression(Expression left, Expression right, LogicOperator operator) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		return this.operator.evaluate(this.left, this.right, context);
	}
}