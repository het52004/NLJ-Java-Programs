public class Constructor {
    Constructor() {
        System.out.println("Constructor called");
    }
    public static void main(String[] args) {
        B obj = new B(); // Both A and B constructor will be called
    }
}

class A{
    A(){
        System.out.println("A Constructor called");
    }
    A(int a){
        System.out.println("A Constructor called with a = " + a);
    }
}

class B extends A{
    B(){
        // super(); // This will call the parent class constructor too! but only if it is the first line of the constructor of B.
        System.out.println("B Constructor called");
    }
}