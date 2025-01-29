public class Multithreading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        a.start();
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
        for(int i = 0; i <= 10; i++){
            System.out.println("Thread b i = " + i);
        }
    }
}