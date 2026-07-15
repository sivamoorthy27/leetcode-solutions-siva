class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean first = false;
            boolean second = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i] + diff)
                    first = true;

                if (nums[j] == nums[i] + 2 * diff)
                    second = true;
            }

            if (first && second)
                count++;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna