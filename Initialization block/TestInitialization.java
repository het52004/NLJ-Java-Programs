/* 
 * Priority of execution 
 * 1. Static block
 * 2. Main method
 * 3. Instance block
 * 4. Constructor
*/
public class TestInitialization {
    static {
        System.out.println("Static block"); // gets called even if object is not created
    }
    {
        System.out.println("Instance block"); // gets called when object is created
    }
    TestInitialization() {
        System.out.println("Constructor"); // gets called when object is created
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        TestInitialization obj = new TestInitialization();
    }
}
