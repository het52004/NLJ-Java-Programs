public class Practice {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.setDetails();
        b.getDetails();
    }
}

class A{
    A(){
        System.out.println("Constructor of class A");
    }
    int age;
    String name;
    void setDetails(){
        name = "Het";
        age = 22;
    }
    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class B extends A{
    B(){
        System.out.println("Constructor of class B");
    }
    void setDetails(){
        super.name = "Jack";
        super.age = 23;
    }
    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}