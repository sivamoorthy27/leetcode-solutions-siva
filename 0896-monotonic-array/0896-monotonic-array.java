class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < nums.length; i++) {
    if (nums[i] > nums[i - 1])
        dec = false;

    if (nums[i] < nums[i - 1])
        inc = false;
}
return inc || dec;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna