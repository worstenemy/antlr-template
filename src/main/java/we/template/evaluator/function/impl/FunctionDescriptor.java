package we.template.evaluator.function.impl;

import java.util.Arrays;
import java.util.Objects;

public class FunctionDescriptor {
	private static final NamingRoute STRATEGY = new CaseSensitiveRoute();

	private static final Class<?>[] EMPTY = {};

	private final String methodName;

	private final Class<?>[] actualTypes;

	FunctionDescriptor(String methodName, Class<?>[] actualTypes) {
		Objects.requireNonNull(methodName, "method name cannot be null");
		this.methodName = STRATEGY.toFunctionName(methodName);
		this.actualTypes = actualTypes == null ? EMPTY : SignatureHelper.toWrapper(actualTypes);
	}

	FunctionDescriptor(String methodName, Object[] args) {
		Objects.requireNonNull(methodName, "method name cannot be null");
		this.methodName = STRATEGY.toFunctionName(methodName);
		if (null == args) {
			this.actualTypes = EMPTY;
		} else {
			this.actualTypes = toParamTypes(args);
		}
	}

	public String getMethodName() {
		return methodName;
	}

	public Class<?>[] getActualTypes() {
		return actualTypes;
	}

	private Class<?>[] toParamTypes(Object[] args) {
		Class<?>[] types = new Class<?>[args.length];
		for (int i = 0; i < types.length; ++i) {
			Class<?> type = SignatureHelper.toWrapper(args[i].getClass());
			types[i] = type;
		}
		return types;
	}

	@Override
	public int hashCode() {
		return 31 * this.methodName.hashCode() ^ Arrays.hashCode(this.actualTypes);
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof FunctionDescriptor)) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		FunctionDescriptor that = (FunctionDescriptor) obj;
		return this.methodName.equals(that.methodName) &&
				Arrays.equals(this.actualTypes, that.actualTypes);
	}
}