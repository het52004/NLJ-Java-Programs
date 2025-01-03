public class TryStaticKeyword {
    static int number = 5;
    int number2 = 10;
    public static void main(String[] args) {
        TryStaticKeyword t1 = new TryStaticKeyword();
        t1.display();
    }
    public void display(){
        System.out.println("Static number: " + number);
        System.out.println("Non-static number: " + number2);
    }
}
