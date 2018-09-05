package we.template.evaluator.function.impl;

public class BuildInFunctions {
	public Object IF(boolean b, Object o1, Object o2) {
		return b ? o1 : o2;
	}

	public int len(String s) {
		if (null == s || s.isEmpty()) {
			return 0;
		}
		return s.length();
	}
}