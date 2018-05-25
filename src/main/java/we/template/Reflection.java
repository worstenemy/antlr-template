package we.template;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reflection {
	private static final String EQUALS = "equals";

	private static final Set<String> FORBIDDEN_METHOD;

	static {
		Set<String> forbidden = new HashSet<>();

		forbidden.add("clone");
		forbidden.add("notify");
		forbidden.add("notifyAll");
		forbidden.add("wait");
		forbidden.add("finalize");
		forbidden.add("getClass");

		FORBIDDEN_METHOD = Collections.unmodifiableSet(forbidden);
	}

	public static Object getField(Object target, String fieldName) {
		Class<?> clazz = target.getClass();
		Field field = getOrThrow(() -> clazz.getDeclaredField(fieldName));

		boolean accessible = field.isAccessible();
		field.setAccessible(true);

		Object result = getOrThrow(() -> field.get(target));
		field.setAccessible(accessible);
		return result;
	}

	public static Object invokeMethod(Object target, String methodName, Object... args) {
		if (FORBIDDEN_METHOD.contains(methodName)) {
			throw new RuntimeException("invoke forbidden method: " + methodName);
		}
		Class<?> clazz = target.getClass();
		Method method = getOrThrow(() -> {
			if (EQUALS.equals(methodName)) {
				Class<?>[] paramType = {Object.class};
				return clazz.getMethod(EQUALS, paramType);
			}
			if (null == args) {
				return clazz.getMethod(methodName);
			}
			Class<?>[] paramType = new Class[args.length];
			for (int i = 0; i < args.length; ++i) {
				paramType[i] = args[i].getClass();
			}
			return clazz.getMethod(methodName, paramType);
		});

		boolean accessible = method.isAccessible();
		method.setAccessible(true);

		Object result = getOrThrow(() -> method.invoke(target, args));
		method.setAccessible(accessible);

		return result;
	}

	private static <T> T getOrThrow(SupplierThrow<T> function) {
		try {
			return function.get();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}