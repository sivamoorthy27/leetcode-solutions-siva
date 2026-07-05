class Solution {
    public String triangleType(int[] nums) {
         if (nums[0] + nums[1] <= nums[2] ||
            nums[0] + nums[2] <= nums[1] ||
            nums[1] + nums[2] <= nums[0]) {
            return "none";
        } 
       int eq=0;      
        for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j])eq++;
           }
        }
        return (eq==3)?"equilateral":(eq==1)?"isosceles":"scalene";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna