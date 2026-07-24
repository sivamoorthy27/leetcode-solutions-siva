class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int ret=0;
        for(int b:map.keySet()){
            int c=map.get(b);
            if((c>arr.length/4)){
                ret= b;
            }
        }
        return ret;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna