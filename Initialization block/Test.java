public class Test {
    static int staticVariable;
    int instanceVariable;
    Test(){
        System.out.println("Test Constructor");
    }
    public static void main(String[] args) {
        
    }
    {
        System.out.println("Instance block");
        instanceVariable=3;
        System.out.println(staticVariable);
    }
    static{
        System.out.println("Static block");
        staticVariable=10;
        testMethod();
    }
    public static void testMethod(){
        System.out.println("Static Test Method executed by static block");
    }
}
