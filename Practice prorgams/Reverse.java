import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int number;
        System.err.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        System.out.println("The reverse of " + number + " is " + reverse(number));
        sc.close();
    }
    public static int reverse(int number){
        int reversedNumber = 0, remainder;
        while(number > 0){
            remainder = number % 10;
            reversedNumber = (reversedNumber * 10)+ remainder;
            number = number / 10;
        }
        return reversedNumber;
    }
}
