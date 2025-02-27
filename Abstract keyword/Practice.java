public class Practice {
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}

abstract class A {
    abstract public void test();
}

class B extends A {
    public void test(){
        System.out.println("hello");
    }
}