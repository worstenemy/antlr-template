package we.template.context.impl;

import we.template.function.Function;
import we.template.function.FunctionDescriptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalEvaluationContext extends AbstractEvaluation {
	GlobalEvaluationContext() {

	}

	@Override
	protected Map<String, Object> newParametersMap() {
		return new ConcurrentHashMap<>(64);
	}

	@Override
	protected Map<FunctionDescriptor, Function> newFunctionsMap() {
		return new ConcurrentHashMap<>(64);
	}

	@Override
	public void registerGlobalParameter(String reference, Object value) {
		throw new UnsupportedOperationException("use register local");
	}

	@Override
	public void registerGlobalFunction(Class<?> function) {
		throw new UnsupportedOperationException("use register local");
	}
}