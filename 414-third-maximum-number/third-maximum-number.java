class Solution {
    public int thirdMax(int[] nums) {
        long max = nums[0];
        long smax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i = 1;i<nums.length;i++){
            
            long curr = nums[i];
            if (curr == max||curr==smax||curr == thirdMax){
                continue;
            }
            if(curr > max){
               thirdMax= smax;
                smax = max;
                max = curr;

            }
            else if(curr>smax){
                thirdMax=smax;
                smax = curr;
            }
            else if(curr>thirdMax){
                thirdMax=curr;
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            return(int) max;
        }
        return (int) thirdMax;
        
    }
    
}