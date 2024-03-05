package uml;

public class Test {
    private Test2 foo1 = new Test2(); // Composition
    private Test2 foo2;

    public Test(Test2 foo2) {
        this.foo2 = foo2; // Aggregation
    }

    public void printTest2(Test2 test2) {
        test2.print(); // Dependency
    }
}
