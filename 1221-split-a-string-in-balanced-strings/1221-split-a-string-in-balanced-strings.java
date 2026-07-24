class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                ans++;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna