class Solution {
    public String restoreString(String s, int[] indices) {
        String a="";
        int[]b=new int[indices.length];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<b.length;j++){
                 if(i==indices[j]){
                    a+=s.charAt(j);
                 }
            }  
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna