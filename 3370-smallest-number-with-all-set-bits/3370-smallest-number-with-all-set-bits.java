class Solution {
    public int smallestNumber(int n) {
        int x=0;
        while(x<n){
            x=(x<<1)|1;
        }
        return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna