class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);

        }
        if(b.equals(a)){
            return true;
        }
        else{
         return false;
        }

    }
}