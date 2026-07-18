class Solution {
    public boolean isGood(int[] nums) {
        int g=0;
        int len =nums.length-1;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(Integer a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=1;i<len;i++){
            if(map.getOrDefault(i,0)!=1) return false;
        }
        if(map.getOrDefault(len,0)!=2) return false;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna