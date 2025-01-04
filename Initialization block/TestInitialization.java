public class TestInitialization {
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }
    TestInitialization() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        TestInitialization t1 = new TestInitialization();
    }
}
