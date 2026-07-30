class Solution {
    public int minimumPushes(String word) {
        int count =0;
        for(int i=1;i<=word.length();i++){
            if(i<=8){
                count+=1;
            }
            else if(i>8 && i<=16){
                count+=2;
            }
            else if(i>16 && i<=24){
                count+=3;
            }
            else if(i>24){
                count+=4;
            }

        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna