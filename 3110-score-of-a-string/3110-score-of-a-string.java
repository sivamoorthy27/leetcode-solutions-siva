class Solution {
    public int scoreOfString(String s) {
        int val=0;
        for(int i=1;i<s.length();i++){
            int a=Math.abs(s.charAt(i)-s.charAt(i-1));
            val+=a;
        }
        return val;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna