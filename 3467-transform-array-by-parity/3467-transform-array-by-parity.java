class Solution {
    public int[] transformArray(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) a[i]=0;
            else a[i]=1;
        }
        Arrays.sort(a);
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna