public class PowerOfTwo{
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
    public static boolean isPowerOfTwo(int n) {
        int power = 1;
        if(n == 1){
            return true;
        }else{
            while(power <= n / 2){
                power *= 2;
                if(power == n){
                    return true;
                }
            }
        }
        return false;
    }
}