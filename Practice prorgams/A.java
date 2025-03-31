import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(divide(sc));
        }catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code ... ");
        sc.close();
    }

    public static int divide(Scanner sc)throws ArithmeticException, InputMismatchException {
        System.out.println("Enter first number:- ");
        int a = sc.nextInt();
        System.out.println("Enter second number:- ");
        int b = sc.nextInt();
        return a / b;
    }
}