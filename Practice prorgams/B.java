import java.util.Scanner;

public class B {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int age = sc.nextInt();
        checkAge(age);
        sc.close();
    }

    public static boolean checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
        } else {
            return true;
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException() {

    }

    InvalidAgeException(String s) {
        super(s);
    }
}