class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
       
    }
     String a=sb.toString();
        String b=sb.reverse().toString();
        if(a.equals(b)){
            return true;
        }
        else{
        return false;}
        
    }
}
