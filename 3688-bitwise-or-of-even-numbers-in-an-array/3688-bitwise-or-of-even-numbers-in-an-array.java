class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int [] arr=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[k++]=nums[i];
            }
        }
        int bit=arr[0];
        for(int j=1;j<k;j++){
            bit|=arr[j];
        }
        return bit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna