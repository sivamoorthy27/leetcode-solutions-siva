class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
            int a=nums1[i];
            for(int j=0;j<nums2.length;j++){
                int b=nums2[j]*k;
                if(a%b==0) count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna