class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=Math.min(word1.length(),word2.length());

        String a="";
        for(int i=0;i<m;i++){
            a+=word1.charAt(i);
            a+=word2.charAt(i);
        }
        if(word1.length()>word2.length()) a+=word1.substring(m);
        else a+=word2.substring(m);
        return a;
    }
}