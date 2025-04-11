public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
    public static int lengthOfLastWord(String s){
        String str = s.trim();
        System.out.println(str);
        String regex = "[\\s]";
        String arr[] = str.split(regex);
        return (arr[arr.length - 1].length());
    }
}
