package we.template.evaluator.expression;

import we.template.evaluator.function.EvaluationContext;
import we.template.evaluator.function.impl.GlobalContext;

public interface Expression {
	Object evaluate(EvaluationContext context);

	default Object evaluate() {
		return evaluate(GlobalContext.context);
	}
}