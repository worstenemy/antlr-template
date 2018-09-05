package we.template.evaluator.function.impl;

import we.template.evaluator.function.Function;

import java.lang.reflect.Method;

public class JavaMethod extends Function {
	private final Method method;

	private final Object instance;

	private final FunctionDescriptor descriptor;

	JavaMethod(Method method, Object instance, FunctionDescriptor descriptor) {
		this.method = method;
		this.instance = instance;
		this.descriptor = descriptor;
	}

	@Override
	public Object call(Object... args) {
		try {
			return this.method.invoke(this.instance, args);
		} catch (Exception e) {
			throw new RuntimeException("invoke method error: " + e.getCause());
		}
	}

	@Override
	public boolean isCompatible(Class<?>[] types) {
		if (null == types) {
			return null == this.descriptor.getActualTypes();
		}
		if (null == this.descriptor.getActualTypes()) {
			return false;
		}
		int actualParamLength = this.descriptor.getActualTypes().length;
		return actualParamLength == types.length && paramTypesCompatible(this.descriptor.getActualTypes(), types);
	}

	private boolean paramTypesCompatible(Class<?>[] expectTypes, Class<?>[] actualTypes) {
		int length = expectTypes.length;
		boolean match = true;
		for (int i = 0; i < length; ++i) {
			if (!isAssignmentCompatible(expectTypes[i], actualTypes[i])) {
				match = false;
				break;
			}
		}
		return match;
	}

	private boolean isAssignmentCompatible(Class<?> expectType, Class<?> actualType) {
		return (expectType.isAssignableFrom(actualType)) ||
				(expectType.isPrimitive() && SignatureHelper.toWrapper(expectType) == actualType);
	}
}