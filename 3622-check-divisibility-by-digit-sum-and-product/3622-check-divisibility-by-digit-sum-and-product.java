class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(temp>0){
            int t=temp%10;
            sum+=t;
            pro*=t;
            temp/=10;
        }
        return (n%(sum+pro)==0)?true:false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna