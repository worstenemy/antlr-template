package we.template.reflection;

import we.template.SupplierThrow;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReflectionHelper {
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

	private static final Map<Class<?>, Class<?>> PRIMITIVE_2_WRAPPER;

	static {
		Map<Class<?>, Class<?>> primitives2Wrapper = new HashMap<>(8);

		primitives2Wrapper.put(boolean.class, Boolean.class);
		primitives2Wrapper.put(byte.class, Byte.class);
		primitives2Wrapper.put(char.class, Character.class);
		primitives2Wrapper.put(short.class, Short.class);
		primitives2Wrapper.put(int.class, Integer.class);
		primitives2Wrapper.put(float.class, Float.class);
		primitives2Wrapper.put(long.class, Long.class);
		primitives2Wrapper.put(double.class, Double.class);

		PRIMITIVE_2_WRAPPER = Collections.unmodifiableMap(primitives2Wrapper);
	}

	public static Class<?> getWrapper(Class<?> primitive) {
		return PRIMITIVE_2_WRAPPER.get(primitive);
	}

	public static Class<?>[] replaceTypes(Class<?>[] types) {
		if (null != types) {
			for (int i = 0; i < types.length; ++i) {
				Class<?> type = types[i];
				types[i] = replaceOrDefault(type);
			}
		}
		return types;
	}

	public static Class<?>[] getReplacedTypes(Object... args) {
		if (null == args) {
			return null;
		}
		Class<?>[] paramTypes = new Class[args.length];
		for (int i = 0; i < args.length; ++i) {
			Class<?> type = args[i].getClass();
			paramTypes[i] = replaceOrDefault(type);
		}
		return paramTypes;
	}

	private static Class<?> replaceOrDefault(Class<?> clazz) {
		return clazz.isPrimitive() ? getWrapper(clazz) : clazz;
	}

	public static Object invokeField(Object target, String fieldName) {
		Class<?> clazz = target.getClass();
		SupplierThrow<Field> fieldSupplier = () -> clazz.getDeclaredField(fieldName);
		Field field = fieldSupplier.getOrThrow();

		boolean accessible = field.isAccessible();
		field.setAccessible(true);

		SupplierThrow<Object> resultSupplier = () -> field.get(target);
		Object result = resultSupplier.getOrThrow();
		field.setAccessible(accessible);
		return result;
	}

	public static Object invokeMethod(Object target, String methodName, Object... args) {
		if (FORBIDDEN_METHOD.contains(methodName)) {
			throw new RuntimeException("invoke forbidden method: " + methodName);
		}
		Class<?> clazz = target.getClass();
		Class<?>[] paramTypes = getReplacedTypes(args);
		Method method = MethodHelper.searchMethod(clazz, methodName, paramTypes);

		boolean accessible = method.isAccessible();
		method.setAccessible(true);

		SupplierThrow<Object> supplier = () -> method.invoke(target, args);
		Object result = supplier.getOrThrow();
		method.setAccessible(accessible);

		return result;
	}
}