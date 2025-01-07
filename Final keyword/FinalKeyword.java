public class FinalKeyword {
    final int a = 10; // final instance variable
    final static int b = 20; // final static variable
    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.a);
        System.out.println(FinalKeyword.b);
        obj.finalVariable();
    }
    public void finalVariable() {
        final int c; // final local variable
        c = 10;
        System.out.println(c);
    }
}

final class A {
    // final class cannot be inherited
}

class B{
    public final void show() {
        System.out.println("show method in B class");
    }
}

class C extends B {
    // final method cannot be overridden
    // public void show() {
    //     System.out.println("show method in C class");
    // }
}