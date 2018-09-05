package we.template.evaluator.function.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SignatureHelper {
	private static final Map<Class<?>, Class<?>> PRIMITIVE_MAPPER;

	static {
		Map<Class<?>, Class<?>> map = new HashMap<>(8);

		map.put(boolean.class, Boolean.class);
		map.put(byte.class, Byte.class);
		map.put(char.class, Character.class);
		map.put(short.class, Short.class);
		map.put(int.class, Integer.class);
		map.put(float.class, Float.class);
		map.put(long.class, Long.class);
		map.put(double.class, Double.class);

		PRIMITIVE_MAPPER = Collections.unmodifiableMap(map);
	}

	public static Class<?>[] toWrapper(Class<?>[] types) {
		if (null != types) {
			for (int i = 0; i < types.length; i++) {
				Class<?> type = types[i];
				if (type.isPrimitive()) {
					types[i] = PRIMITIVE_MAPPER.get(type);
				}
			}
			return types;
		}
		return null;
	}

	public static Class<?> toWrapper(Class<?> type) {
		if (null != type) {
			return type.isPrimitive() ? PRIMITIVE_MAPPER.get(type) : type;
		}
		return null;
	}
}