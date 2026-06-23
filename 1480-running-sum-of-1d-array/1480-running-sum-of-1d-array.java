class Solution {
    public int[] runningSum(int[] nums) {
      int[] sum=new int[nums.length];
      sum[0]=nums[0];
      for(int i=1;i<nums.length;i++){
        for(int j=0;j<=i;j++){
            sum[i]+=nums[j];
        }
        
      }
      return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna