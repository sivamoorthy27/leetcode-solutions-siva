class Solution {
    public int sumOfSquares(int[] nums) {
        int a=nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(a % (i+1)==0){
                int sq=nums[i]*nums[i];
                sum+=sq;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna