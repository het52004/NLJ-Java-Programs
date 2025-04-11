public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }

    public static int mySqrt(int x) {
        int sqrt = 0;
        if(x == 1){
            return 1;
        }
        for (int i = 0; i <= x / 2; i++) {
            long square = (long)i * i;
            if(square == x){
                return i;
            }else if(square < x){
                sqrt = i;
            }else{
                break;
            }
        }
        return sqrt;
    }
}
