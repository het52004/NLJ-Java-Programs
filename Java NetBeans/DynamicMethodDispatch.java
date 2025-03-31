public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new B();
        a.greet();
        a.getAge();
    }
}

class A{
    int age = 22;
    public void greet(){
        System.out.println("Hello from class A");
    }
    public void getAge(){
        System.out.println(age);
    }
}

class B extends A{
    int age = 20;
    
}