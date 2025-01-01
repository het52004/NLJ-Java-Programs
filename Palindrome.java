public class Palindrome {
    public static void main(String[] args) {
        int number;
        System.err.println("Enter a number: ");
        number = Integer.parseInt(System.console().readLine());
        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome number.");
        }else{
            System.out.println(number + " is not a palindrome number.");
        }
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
