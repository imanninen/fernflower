package records;

public record TestRecordMulti(int a, double b, String c, int d) {
  public TestRecordMulti(int a, int d) {
    this(a, 0.0, "", d);
  }

  public int a() {
    return d;
  }

  public int d() {
    return a;
  }
}
