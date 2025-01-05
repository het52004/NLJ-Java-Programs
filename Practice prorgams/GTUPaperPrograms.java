public class GTUPaperPrograms {
    public static void main(String[] args) {
        // Write a program to find the second largest element in an array.
        int[] nums = { 1, 5, 3, 9, 7 }; // length = 5
        int m = 1;
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m) {
                s = m;
                m = nums[i];
            } else if (nums[i] > s && nums[i] != m) {
                s = nums[i];
            }
        }
        System.out.println("S is: " + s);
    }
}