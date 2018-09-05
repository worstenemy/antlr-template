package we.template.evaluator.function.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CaseSensitiveRoute implements NamingRoute {
	private static final Map<String, String> NAMING_MAP;

	static {
		Map<String, String> map = new HashMap<>(8);

		map.put("if", "IF");

		NAMING_MAP = Collections.unmodifiableMap(map);
	}

	@Override
	public String toFunctionName(String name) {
		String result;
		return (null == (result = NAMING_MAP.get(name))) ? name : result;
	}
}