class Solution {
    public int findNumbers(int[] nums) {

        int c = 0;

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];
            int digits = 0;

            while (curr > 0) {
                curr = curr / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                c++;
            }
        }

        return c;
    }
}