package we.template.context.impl;

import we.template.function.Function;
import we.template.function.FunctionDescriptor;
import we.template.reflection.ReflectionHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DefaultEvaluationContext extends AbstractEvaluation {
	public static final AbstractEvaluation GLOBAL = new GlobalEvaluationContext();

	@Override
	protected Map<String, Object> newParametersMap() {
		return new HashMap<>(32);
	}

	@Override
	protected Map<FunctionDescriptor, Function> newFunctionsMap() {
		return new HashMap<>(32);
	}

	@Override
	public Optional<Object> getParameter(String reference) {
		Optional<Object> value = super.getParameter(reference);
		return value.isPresent() ? value : GLOBAL.getParameter(reference);
	}

	@Override
	public Optional<Function> getFunction(String reference, Object... params) {
		Class<?>[] paramTypes = ReflectionHelper.getParamTypes(params);
		FunctionDescriptor descriptor = new FunctionDescriptor(reference, paramTypes);
		Function function = super.getFunction(descriptor);
		if (null == function) {
			function = GLOBAL.getFunction(descriptor);
		}
		return Optional.ofNullable(function);
	}

	public static void registerGlobalArg(String reference, Object value) {
		GLOBAL.registerLocalParameter(reference, value);
	}

	public static Optional<Object> getGlobalArg(String reference) {
		return GLOBAL.getParameter(reference);
	}

	@Override
	public void registerGlobalParameter(String reference, Object value) {
		GLOBAL.registerLocalParameter(reference, value);
	}

	public static void registerGlobalMethod(Class<?> function) {
		GLOBAL.registerLocalFunction(function);
	}

	public static Optional<Function> getGlobalMethod(String reference, Object... params) {
		return GLOBAL.getFunction(reference, params);
	}

	@Override
	public void registerGlobalFunction(Class<?> function) {
		GLOBAL.registerLocalFunction(function);
	}
}