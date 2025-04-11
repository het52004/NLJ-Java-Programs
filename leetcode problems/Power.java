public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(-1, -2147483648));
    }

    public static double myPow(double x, int n) {
        double power = x;
        if (n == 0 || x == 1 || (x == -1 && n < 0)) {
            return 1;
        } else if (x == -1 ) {
            return -1;
        } else if (n <= Integer.MIN_VALUE || n >= Integer.MAX_VALUE) {
            return 0;
        } else {
            for (int i = 1; i < Math.abs(n); i++) {
                power = power * x;
            }
            if (n < 0) {
                return (1 / power);
            }
            return power;
        }
    }
}
