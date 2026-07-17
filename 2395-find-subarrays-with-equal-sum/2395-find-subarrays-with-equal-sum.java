class Solution {
    public boolean findSubarrays(int[] nums) {
        boolean a=false;
        for(int j=0;j<nums.length-1;j++){
            int b=nums[j]+nums[j+1];
        for(int i=j+1;i<nums.length-1;i++){
            int c=nums[i]+nums[i+1];
            if(b==c) a=true;
        }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna