class Solution {
    public String smallestPalindrome(String s) {
       int a[]=new int[26];
       for(char c:s.toCharArray()){
        a[c-'a']++;
       }
       StringBuilder sb=new StringBuilder();
       String middle="";
       for(int i=0;i<26;i++){
        for(int j=0;j<a[i]/2;j++){
            sb.append((char)(i+'a'));
        }
        if(a[i]%2==1){
            middle=String.valueOf((char)(i+'a'));
        }
       }
       String right=new StringBuilder(sb).reverse().toString();
        return sb.toString()+middle+right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna