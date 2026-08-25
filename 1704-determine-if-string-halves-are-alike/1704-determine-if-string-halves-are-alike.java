class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int c1=0;
        int c2=0;
        String a=s.substring(0,mid);
        String b=s.substring(mid);
        for(int i=0;i<a.length();i++){
            if("aeiouAEIOU".indexOf(a.charAt(i))!=-1) c1++;
            if("aeiouAEIOU".indexOf(b.charAt(i))!=-1) c2++;
        }
        return (c1==c2)?true:false;
    }
}