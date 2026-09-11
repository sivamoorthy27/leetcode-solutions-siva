class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean boo=true;
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            int c=a-b;
            if(Math.abs(c)>2){
                boo=false;
                break;
            }
            else boo=true;
        }
        return boo;

    }
}