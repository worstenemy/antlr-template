package we.template.segment;

import we.template.Segment;

public class ObjectEvalSegment implements Segment {
	private final String object;

	public ObjectEvalSegment(String object) {
		this.object = object;
	}

	@Override
	public String getText() {
		return this.object;
	}

	@Override
	public Object eval() {
		return null;
	}
}