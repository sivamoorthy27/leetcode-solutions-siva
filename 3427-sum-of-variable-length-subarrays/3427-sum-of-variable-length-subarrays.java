class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            //int[]arr=new int[nums.length];
            for(int j=Math.max(0,i-nums[i]);j<=i;j++){
                sum+=nums[j];
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna