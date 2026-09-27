class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFactors = new HashSet<>();
        for(int x : nums){
            for(int j = 2; j*j <= x;j++){
                if(x%j==0){
                    primeFactors.add(j);
                    while (x % j == 0) {
                        x/=j;
                    }
                }
            }
            if(x>1){
                primeFactors.add(x);
            }
        }
        return primeFactors.size();
    }
}