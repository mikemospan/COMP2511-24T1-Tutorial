package uml;

public class Example {
    public static void main(String[] args) {
        Test2 foo3 = new Test2();
        Example example = new Example();
        example.foo(foo3);
        // ... foo3
    }

    public void foo(Test2 foo3) {
        Test test = new Test(foo3);
    }
}
