class Solution {
    public int largestAltitude(int[] gain) {
        int a[]=new int[gain.length+1];
        a[0]=0;
        for(int i=1;i<a.length;i++){
                 a[i]=a[i-1]+gain[i-1];
        }
        int max=0;
         for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
         }
         return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna