class A {
    public void overloadingInAClass(){
        System.out.println("Overloading in A class");
    }
    public void overloadingInAClass(int a){
        System.out.println("Overloading in A class with int parameter");
    }
}
class B extends A{
    
}

public class Overloading {
    public static void main(String[] args) {
        // A a = new A();
        // a.overloadingInAClass();
        // a.overloadingInAClass(1);

        // B b = new B();
        // b.overloadingInAClass();
        // b.overloadingInAClass(1);
    }
}