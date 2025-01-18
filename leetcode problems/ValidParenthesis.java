public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        isValid(s);
    }
    public static boolean isValid(String s) {
        String arr[] = new String[s.length()];
        int arrIndex = 0;
        for(int i = 0; i < s.length(); i++){
            char value = s.charAt(i);
            if(value == '(' || value == '{' || value == '['){
                arr[arrIndex] = Character.toString(value);
            }
        }
    }
}
