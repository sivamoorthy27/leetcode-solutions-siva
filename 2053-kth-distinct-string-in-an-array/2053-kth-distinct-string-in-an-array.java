class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap <String,Integer>m=new HashMap<>();
        for(String a:arr){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int c=0;
        for(String b:arr){
            if(m.get(b)==1)c++;
            if(c==k){
                return b;
            }
        }
        return "";
    }
}