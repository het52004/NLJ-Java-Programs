public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.show(5); // show Method executed from class A
        B b = new B();
        b.show(5); // show Method executed from class B
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