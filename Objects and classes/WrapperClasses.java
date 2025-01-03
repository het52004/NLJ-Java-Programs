/*    

    Wrapper classes are used to convert any primitive data type into an object. The table below shows the primitive data types and their corresponding wrapper classes.

    Primitive Type -> Wrapper Class (Class Names)
    byte	          Byte
    short	          Short
    int	              Integer
    long	          Long
    float	          Float
    double	          Double
    char	          Character
    boolean	          Boolean

*/
public class WrapperClasses {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num); // Convert string to integer
    }
}
