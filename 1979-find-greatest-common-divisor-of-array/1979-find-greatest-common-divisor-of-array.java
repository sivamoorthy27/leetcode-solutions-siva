class Solution {
    public int findGCD(int[] nums) {
        int g=0;
        int s=Integer.MAX_VALUE;
        int gcd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>g) g=nums[i];
            if(nums[i]<s) s=nums[i];
        }
        for(int i=1;i<=Math.min(g,s);i++){
            if(s%i==0 && g%i==0) gcd=i;
        }
        return gcd;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna