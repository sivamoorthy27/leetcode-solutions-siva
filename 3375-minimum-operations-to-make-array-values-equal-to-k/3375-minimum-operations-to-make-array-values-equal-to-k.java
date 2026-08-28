class Solution {
    public int minOperations(int[] nums, int k) {
        int count =0;
       HashMap<Integer,Integer>a=new HashMap<>();
       for(int i:nums){
        if (i < k) {
                return -1;
            }
        a.put(i,a.getOrDefault(i,0)+1);
       }
       for(int b:a.keySet()){
        if(b>k) count++;
       }
       return count;
    }
}