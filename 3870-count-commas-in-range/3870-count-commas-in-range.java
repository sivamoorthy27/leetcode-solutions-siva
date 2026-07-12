class Solution {
    public int countCommas(int n) {
        int ans =0;
        if (n>= 1000)
            ans+=n-1000+1;
        if (n >= 1000000)
            ans+=n-1000000 + 1;
        if (n >=1000000000)
            ans += n-1000000000 +1;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna