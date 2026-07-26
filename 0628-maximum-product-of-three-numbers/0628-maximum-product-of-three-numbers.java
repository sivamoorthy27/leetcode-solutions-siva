class Solution {
    public int maximumProduct(int[] nums) {
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
         int t=Integer.MIN_VALUE;
         int s1=Integer.MAX_VALUE;
          int s2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>=f){
             t=s;
             s=f;
             f=nums[i];
           }
           else if(nums[i]>=s){
            t=s;
            s=nums[i];
           }
           else if(nums[i]>=t &&nums[i]<=s){
            t=nums[i];
           }
           }
           for(int j=0;j<nums.length;j++){
             if(nums[j]<s1){
            s2=s1;
            s1=nums[j];
           }
           else if(nums[j]<s2){
            s2=nums[j];
           }
           }
            
        int mul1= f*s*t;
        int mul2=f*s1*s2;
        return (mul1>mul2)?mul1:mul2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna