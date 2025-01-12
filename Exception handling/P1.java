public class P1 {
    public static void main(String[] args) {
        try {
            int num = quotient(25, 1);
            System.out.println(num);
        } 
        catch (ArithmeticException e) {
            System.out.println("Divisor cannot be zero!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues....");
    }

    public static int quotient(int a, int b) throws Exception{
        if(b == 1){
            throw new Exception("Div cannot be one");
        }
        return a / b;
    }
}
