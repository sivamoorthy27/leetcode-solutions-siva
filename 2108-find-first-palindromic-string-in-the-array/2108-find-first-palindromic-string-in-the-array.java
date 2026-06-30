class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
             if(word.equals(rev)){
                return rev;
            }
            }
            return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna