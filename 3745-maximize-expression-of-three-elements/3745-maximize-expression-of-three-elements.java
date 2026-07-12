class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        int small=nums[0];
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a>large){
                seclarge=large;
                large=a;
            }
            else if( a>seclarge){
                seclarge=a;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<small ) small=nums[i];
        }
        return large+seclarge-small;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna