package we.template.context.impl;

import we.template.context.EvaluationContext;
import we.template.function.Function;
import we.template.function.FunctionDescriptor;
import we.template.function.JavaMethod;
import we.template.reflection.ReflectionHelper;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public abstract class AbstractEvaluation implements EvaluationContext {
	private final Map<String, Object> parameters;

	private final Map<FunctionDescriptor, Function> functions;

	AbstractEvaluation() {
		this.parameters = newParametersMap();
		this.functions = newFunctionsMap();
	}

	protected abstract Map<String, Object> newParametersMap();

	protected abstract Map<FunctionDescriptor, Function> newFunctionsMap();

	@Override
	public Optional<Object> getParameter(String reference) {
		return Optional.ofNullable(this.parameters.get(reference));
	}

	Function getFunction(FunctionDescriptor descriptor) {
		return this.functions.get(descriptor);
	}

	@Override
	public Optional<Function> getFunction(String reference, Object... params) {
		FunctionDescriptor descriptor = new FunctionDescriptor(reference, ReflectionHelper.getParamTypes(params));
		return Optional.ofNullable(this.functions.get(descriptor));
	}

	@Override
	public void registerLocalParameter(String reference, Object value) {
		this.parameters.putIfAbsent(Objects.requireNonNull(reference, "reference is null"), value);
	}

	@Override
	public void registerLocalFunction(Class<?> function) {
		if (null == function) {
			return;
		}
		Object instance = newInstance(function);
		Method[] methods;
		if (null != instance && 0 != (methods = function.getDeclaredMethods()).length) {
			for (Method method : methods) {
				Class<?>[] paramTypes = method.getParameterTypes();
				FunctionDescriptor descriptor = new FunctionDescriptor(method.getName(), ReflectionHelper.replaceTypes(paramTypes));
				this.functions.computeIfAbsent(descriptor, key -> new JavaMethod(method, instance));
			}
		}
	}

	private static Object newInstance(Class<?> clazz) {
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			return null;
		}
	}
}