import java.lang.invoke.*;

public class Main {
  void foo() throws Throwable {
    MethodHandles.Lookup lookup = MethodHandles.lookup();
    lookup.findVirtual(Test.class, "m2", MethodType.methodType(void.class, float.class, double.class));
  }
}