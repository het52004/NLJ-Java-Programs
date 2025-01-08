public class SuperKeyword { 
    public static void main(String[] args) {  
        B obj = new B();
        obj.f1();
    }
}

class A{
    int z;
}

class B extends A{
    int z;
    public void f1(){
        int z;
        z = 10; // refers to variable z of f1 function
        this.z = 20; // refers to variable z of class B
        super.z = 30; // refers to variable z of class A
        System.out.println(z);
        System.out.println(this.z);
        System.out.println(super.z);
    }
}