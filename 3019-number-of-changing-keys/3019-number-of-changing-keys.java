class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String a=s.toLowerCase();
        for(int i=1;i<a.length();i++){
                if(a.charAt(i)!=a.charAt(i-1)){
                    count ++;
                } 

        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna