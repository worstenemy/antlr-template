package we.template.evaluator;

import we.template.context.EvaluationContext;
import we.template.context.impl.DefaultEvaluationContext;

public interface Evaluator {
	String evaluate(String template, EvaluationContext context);

	default String evaluate(String tempalte) {
		return evaluate(tempalte, DefaultEvaluationContext.GLOBAL);
	}
}