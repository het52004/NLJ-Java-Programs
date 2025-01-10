public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 3,3 }, target = 6;
        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length - 1; j++){
                if((nums[i] + nums[j + 1]) == target){
                    result[0] = i;
                    result[1] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
}