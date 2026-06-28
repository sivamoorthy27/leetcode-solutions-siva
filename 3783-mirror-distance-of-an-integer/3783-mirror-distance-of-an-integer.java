class Solution {
    public int mirrorDistance(int n) {
       int temp=n;
        int rev=0;
        while(temp>0){
           int a=temp%10;
            rev=rev*10+a;
            temp/=10;
        }
        return Math.abs(n-rev);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna