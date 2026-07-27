class Solution {
    public int titleToNumber(String columnTitle) {
        int a=0;
        for(int i=0;i<columnTitle.length();i++){
            a=a*26+(columnTitle.charAt(i)-'A'+1);
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna