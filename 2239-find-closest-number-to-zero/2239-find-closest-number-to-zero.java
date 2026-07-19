class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(ans)) {
                ans = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(ans) && nums[i] > ans) {
                ans = nums[i];
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna