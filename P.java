import java.util.*;

public class P {
    public static void main(String[] args) {
        int[] digits = { 6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3 };
        plusOne(digits);
    }

    public static void plusOne(int[] digits) {
        long numbers = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            numbers += digits[i];
            numbers *= 10;
        }
        numbers = numbers / 10;
        numbers++;
        System.out.println(numbers);
        listOperation(numbers, list);
        int finalArray[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            finalArray[i] = list.get(i);
            // System.out.print(finalArray[i]);
        }
    }

    public static void listOperation(long numbers, List<Integer> list) {
        long n = numbers;
        while (n > 0) {
            list.add((int) (n % 10));
            System.out.print((int) (n % 10));
            n /= 10;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}