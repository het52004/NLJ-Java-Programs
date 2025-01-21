public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE - 1){
            return 0 + 1;
        }
        int reverse = 0, remainder;
        while (x != 0) {
            remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }
        return reverse;
    }
}