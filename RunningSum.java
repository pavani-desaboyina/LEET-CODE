class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        for(i=0;i<nums.length - 1;i++){
            nums[i + 1] = nums[i + 1]+ nums[i];

        }
        return nums;
    }
}