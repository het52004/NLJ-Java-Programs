import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome number.");
        }else{
            System.out.println(number + " is not a palindrome number.");
        }
        sc.close();
    }
    public static boolean isPalindrome(int number){
        int reversedNumber = 0, remainder;
        int originalNumber = number;
        while(number > 0){
            remainder = number % 10;
            reversedNumber = (reversedNumber * 10)+ remainder;
            number = number / 10;
        }
        return originalNumber == reversedNumber;
    }
}
