class Solution {
    public int findFinalValue(int[] nums, int original) {
        int a=original;
        boolean b=true;
        while(b){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==a) {
                    a=2*nums[i];
                    b=true;
                    break;
                } 
                else  b=false;        
        }
        }
        return a;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna