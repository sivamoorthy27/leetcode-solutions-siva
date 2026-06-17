class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sumdigi=0;
        for(int i=0;i<nums.length;i++){
           int temp=nums[i];
             while(temp>0){
                int a=0;
                a=temp%10;
                sumdigi+=a;
              temp/=10;
             }
             sum+=nums[i];
                }
                
                    int diff=sum-sumdigi;
        return diff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna