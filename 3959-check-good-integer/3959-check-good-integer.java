class Solution {
    public boolean checkGoodInteger(int n) {
        int ss=0;
        int ds=0;
        while(n>0){
            int a=n%10;
            ss+=(a*a);
            ds+=a;
            n/=10;
        }
        return (ss-ds>=50)?true:false;
    }
}