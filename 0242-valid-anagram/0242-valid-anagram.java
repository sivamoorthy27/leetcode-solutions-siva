class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>m=new HashMap<>();
        if (s.length() != t.length()) {
    return false;
}
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           m.put(c,m.getOrDefault(c,0)+1); 
        }
        for (int i = 0; i < t.length(); i++) {
    char c = t.charAt(i);
    if(m.containsKey(c)){
        m.put(c,m.get(c)-1);
        if(m.get(c)<0) return false;
    }
    else{
        return false;
    }
}
return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna