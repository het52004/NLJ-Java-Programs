public class TypeConversion {
    public static void main(String[] args) {
        // byte short int long float double
        // Widening
        // byte -> short -> int -> long -> float -> double
        // Narrowing
        // double -> float -> long -> int -> short -> byte
        // Widening conversions are done automatically
        // Narrowing conversions are done manually
        int integerNumber = 3;
        float floatNumber = 3.5f;
        double doubleNumber = 10.5;
        char charValue = 'A';
        // Widening conversions
            // Convert integer to long
            long intToLong = integerNumber;
            // Convert integer to float
            float intToFloat = integerNumber;
            // Convert integer to double
            double intToDouble = integerNumber;
            // Convert long to float
            float longToFloat = intToLong;
            // Convert long to double
            double longToDouble = intToLong;
            // Convert float to double
            double floatToDouble = floatNumber;
        // Narrowing conversions
            // Convert double to float
            float doubleToFloat = (float) doubleNumber;
            // Convert float to integer
            int floatToInt = (int) floatNumber;
            // Convert integer to char
            char intToChar = (char) integerNumber;
            // Convert char to integer
            int charToInt = (int) charValue;
        // Ouputs
        System.out.println("intToLong: " + intToLong);
        System.out.println("intToFloat: " + intToFloat);
        System.out.println("intToDouble: " + intToDouble);
        System.out.println("longToFloat: " + longToFloat);
        System.out.println("longToDouble: " + longToDouble);
        System.out.println("floatToDouble: " + floatToDouble);
        System.out.println("doubleToFloat: " + doubleToFloat);
        System.out.println("floatToInt: " + floatToInt);
        System.out.println("intToChar: " + intToChar);
        System.out.println("charToInt: " + charToInt);
    }
}
