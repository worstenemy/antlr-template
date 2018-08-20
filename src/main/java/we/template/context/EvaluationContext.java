package we.template.context;

import we.template.function.Function;

import java.util.Optional;

public interface EvaluationContext extends EvaluationRegister {
	Optional<Object> getParameter(String reference);

	Optional<Function> getFunction(String reference, Object... params);
}