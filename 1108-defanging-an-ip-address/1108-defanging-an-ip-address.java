class Solution {
    public String defangIPaddr(String address) {
        String b="";
        for(int i=0;i<address.length();i++){
            char a=address.charAt(i);
            if(a =='.'){
                b+="[.]";
            }
            else{
                b+=a;
            }             
                }
        
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna