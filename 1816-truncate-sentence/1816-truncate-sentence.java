class Solution {
    public String truncateSentence(String s, int k) {
        String a="";
        String []b=s.split(" ");
        for(int i=0;i<k;i++){
            a+=b[i]+" ";
        }
        return a.trim();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna