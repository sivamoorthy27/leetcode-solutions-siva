class Solution {
    public int findNonMinOrMax(int[] nums) {
        int g=0;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>g){
                g=nums[i];
            }
            if(nums[i]<s){
                s=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=g&& nums[j]!=s)
            return nums[j];
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna