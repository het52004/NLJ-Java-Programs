public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5, 6 };
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return (k + 1);
    }
}