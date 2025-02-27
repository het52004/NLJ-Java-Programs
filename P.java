import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many prime numbers:- ");
        int nums = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; count < nums; i++) {
            if (i == 2) {
                System.out.print(i + " ");
                count++;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        sc.close();
    }
}