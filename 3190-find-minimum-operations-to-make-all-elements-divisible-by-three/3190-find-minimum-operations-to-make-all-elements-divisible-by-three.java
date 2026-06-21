class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
           int a= nums[i]+1;
           int b= nums[i]-1;
           if(a%3==0 || b%3==0){
            op++;
           }
          // else continue;
           }
        }
        return op;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna