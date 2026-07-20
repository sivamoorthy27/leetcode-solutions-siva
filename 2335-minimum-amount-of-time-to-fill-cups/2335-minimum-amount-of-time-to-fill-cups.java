class Solution {
    public int fillCups(int[] amount) {
       int s=0;
       while(true){
        Arrays.sort(amount);
        if(amount[2]==0){
            break;}
            amount[2]--;
        if(amount[1]>0) amount[1]--;
        s++;
       }
       return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna