public class Test {
    public static void main(String[] args) {
        B.print();
        System.out.println(B.a);
    }
}

class A{
    static int a = 10;
    public static void print(){
        System.out.println("A");
    }
}

class B extends A{
    
}