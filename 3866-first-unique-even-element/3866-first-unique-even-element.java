class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
           
        }
        for(Integer n:nums){
            if(n%2==0 && map.get(n)==1) return n;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna