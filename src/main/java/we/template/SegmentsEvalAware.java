package we.template;

import java.util.List;

public interface SegmentsEvalAware {
  List<Segment> getSegments();

  default String eval() {
    List<Segment> segments = getSegments();
    if (null == segments || segments.isEmpty()) {
      return "";
    }
    if (1 == segments.size()) {
      return segments.get(0).eval();
    }
    StringBuilder builder = new StringBuilder();
    for (Segment segment : segments) {
      builder.append(segment.eval());
    }
    return builder.toString();
  }
}