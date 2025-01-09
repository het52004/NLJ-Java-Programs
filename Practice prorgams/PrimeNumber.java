import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TypesOfPrimeNumberOperations t1 = new TypesOfPrimeNumberOperations();
        System.out.println("Enter 1 for checking if a number is prime or not ");
        System.out.println("Enter 2 for range prime numbers\nEnter 3 to print that many prime numbers");
        System.out.print("Enter your choice:- ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                boolean isPrime = t1.checkIsPrime();
                if (isPrime) {
                    System.out.println("The number is prime");
                } else {
                    System.out.println("The number is not prime");
                }
                break;
            case 2:
                t1.rangeOfPrimeNumbers();
                break;
            case 3:
                t1.printNprimeNumbers();
                break;
            default:
                System.out.println("Enter a valid choice!");
        }
        sc.close();
    }
}

class TypesOfPrimeNumberOperations {
    public boolean checkIsPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        sc.close();
        return isPrime;
    }

    public void rangeOfPrimeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to print all prime numbers till that range:- ");
        int range = sc.nextInt();
        boolean isPrime;
        if (range < 2) {
            System.out.println("Please enter a range greater than 1!");
        } else {
            for (int i = 0; i <= range; i++) {
                isPrime = true;
                if (i < 2) {
                    isPrime = false;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i + " is a prime number");
                }
            }
        }
        sc.close();
    }

    public void printNprimeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt(), index = 1, count = 0;
        boolean isPrime;
        if (number < 1) {
            System.out.println("Please enter number greater than 0!");
        } else {
            for (int i = 0; count < number; i = ((i == 2) ? 3 : i + 2)) {
                isPrime = true;
                if (i < 2) {
                    isPrime = false;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(index + ". " + i + " is a prime number");
                    index++;
                    count++;
                }
            }
        }
        sc.close();
    }
}