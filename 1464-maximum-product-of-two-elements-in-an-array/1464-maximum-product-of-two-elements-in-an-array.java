class Solution {
    public int maxProduct(int[] nums) {
        int l=Integer.MIN_VALUE;
         int sl=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            if(nums[i]>l){
                sl=l;
                l=nums[i];
            }
            else if(nums[i]>sl){
                sl=nums[i];
            }
         }
         return (l-1)*(sl-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna