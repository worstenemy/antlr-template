package we.template.evaluator.expression.impl;

import we.template.evaluator.expression.Expression;
import we.template.evaluator.function.EvaluationContext;

public class CompareExpression implements Expression {
	private enum Comparator {
		gt {
			@Override
			Boolean compare(Comparable<Object> left, Comparable<Object> right) {
				return left.compareTo(right) > 0 ? Boolean.TRUE : Boolean.FALSE;
			}
		},
		lt {
			@Override
			Boolean compare(Comparable<Object> left, Comparable<Object> right) {
				return left.compareTo(right) < 0 ? Boolean.TRUE : Boolean.FALSE;
			}
		},
		ge {
			@Override
			Boolean compare(Comparable<Object> left, Comparable<Object> right) {
				return left.compareTo(right) >= 0 ? Boolean.TRUE : Boolean.FALSE;
			}
		},
		le {
			@Override
			Boolean compare(Comparable<Object> left, Comparable<Object> right) {
				return left.compareTo(right) <= 0 ? Boolean.TRUE : Boolean.FALSE;
			}
		},
		eq {
			@Override
			Boolean compare(Comparable<Object> left, Comparable<Object> right) {
				return left.compareTo(right) == 0 ? Boolean.TRUE : Boolean.FALSE;
			}
		},
		ne {
			@Override
			Boolean compare(Comparable<Object> left, Comparable<Object> right) {
				return left.compareTo(right) != 0 ? Boolean.TRUE : Boolean.FALSE;
			}
		};

		@SuppressWarnings("unchecked")
		Boolean compare(Expression left, Expression right, EvaluationContext context) {
			if (null == left || null == right) {
				throw new IllegalArgumentException("can't compare with null value");
			}
			Object first = left.evaluate(context);
			Object second = right.evaluate(context);
			if (null == first || null == second) {
				throw new IllegalArgumentException("can't compare with null value");
			}
			if (first.getClass() != second.getClass()) {
				throw new IllegalArgumentException("can't compare with different class " + first.getClass() + ", " + second.getClass());
			}
			return compare(Comparable.class.cast(first), Comparable.class.cast(second));
		}

		abstract Boolean compare(Comparable<Object> left, Comparable<Object> right);

		static Comparator fromString(String text) {
			switch (text) {
				case ">":
					return Comparator.gt;
				case "<":
					return Comparator.lt;
				case ">=":
					return Comparator.gt;
				case "<=":
					return Comparator.lt;
				case "==":
					return Comparator.eq;
				case "!=":
					return Comparator.ne;
				default:
					throw new IllegalArgumentException("not supported comparator " + text);
			}
		}
	}

	private final Expression left;

	private final Expression right;

	private final Comparator comparator;

	public CompareExpression(Expression left, Expression right, String comparator) {
		this.left = left;
		this.right = right;
		this.comparator = Comparator.fromString(comparator);
	}

	@Override
	public Object evaluate(EvaluationContext context) {
		return this.comparator.compare(this.left, this.right, context);
	}
}