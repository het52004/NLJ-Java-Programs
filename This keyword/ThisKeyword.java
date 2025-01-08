public class ThisKeyword{
    int a;
    int b;
    public ThisKeyword(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println("a = " + a + " b = " + b);
    }
    public static void main(String[] args){
        ThisKeyword obj = new ThisKeyword(10, 20);
        obj.display();
    }
}

class A{
    int a;
    public void f1(){
        int a;
        a = 10; // refers local variable a
        this.a = 10; // refers class variable a
    }
}