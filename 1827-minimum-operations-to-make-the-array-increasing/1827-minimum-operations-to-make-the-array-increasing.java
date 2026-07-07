class Solution {
    public int minOperations(int[] nums) {
        int a=0;
        for(int i=1;i<nums.length;i++){
            int c=0;
            if(nums[i]<=nums[i-1]){
               while(nums[i]<=nums[i-1]){
                nums[i]++;
                c++;
               }
               a+=c;
            }
        }
        return a;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna