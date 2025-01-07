public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.show(5); // show Method executed from class A
        B b = new B();
        b.show(5); // show Method executed from class B

        // for method overriding, the method in the parent class should be public
        // and the method in the child class should be public as well
        // if the method in the parent class is private, then it is method hiding
        // if the method in the parent class is final, then it cannot be overridden
        // if the method in the parent class is static, then it cannot be overridden
        // both the method should be same, parameters and return type should be same
    }
}

class A{
    public void show(int a){
        System.out.println("Method called from class A");
    }
}

class B extends A{
    public void show(int a){
        System.out.println("Method called from class B");
    }
}