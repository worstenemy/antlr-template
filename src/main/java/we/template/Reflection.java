package we.template;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public static Object getField(Object target, String fieldName) {
		Class<?> clazz = target.getClass();
		Field field = applyOrThrow(() -> clazz.getDeclaredField(fieldName));

		boolean accessible = field.isAccessible();
		field.setAccessible(true);

		Object result = applyOrThrow(() -> field.get(target));
		field.setAccessible(accessible);
		return result;
	}

	public static Object invokeMethod(Object target, String methodName, Object... args) {
		Class<?> clazz = target.getClass();
		Method method = applyOrThrow(() -> {
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

		Object result = applyOrThrow(() -> method.invoke(target, args));
		method.setAccessible(accessible);

		return result;
	}

	private static <T> T applyOrThrow(Function<T> function) {
		try {
			return function.apply();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@FunctionalInterface
	private interface Function<T> {
		T apply() throws Exception;
	}
}