class Solution {
    public int numberOfCuts(int n) {
       if(n%2==0) return n/2;
       else if(n>1)return n;
       return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna