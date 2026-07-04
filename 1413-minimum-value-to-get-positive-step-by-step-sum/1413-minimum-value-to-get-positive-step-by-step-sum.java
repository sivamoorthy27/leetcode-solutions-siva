class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;

        while (true) {
            int sum = startValue;
            boolean valid = true;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];

                if (sum < 1) {
                    valid = false;
                    startValue++;
                    break;
                }
            }

            if (valid) {
                return startValue;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna