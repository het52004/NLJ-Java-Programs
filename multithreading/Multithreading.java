public class Multithreading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.start();
    }
}

class A extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Thread a i = " + i);
        }
    }
}

class B extends Thread{
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("het");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}