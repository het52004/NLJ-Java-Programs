public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3 };
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0, visited = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (visited == nums[i] && i != 0) {
                    break;
                } else {
                    if (nums[i] == nums[j + 1]) {
                        nums[j + 1] = nums[j + 2];
                        nums[j + 2] = 0;
                        k++;
                    }
                }
            }
            visited = nums[i];
        }
        return k;
    }
}