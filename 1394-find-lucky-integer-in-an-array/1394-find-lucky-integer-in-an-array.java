class Solution {
    public int findLucky(int[] arr) {
        boolean a[]=new boolean[arr.length];
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(a[i]){
                continue;
            }
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    a[j]=true;
                }
            }
            if(count==arr[i] &&count>max)  max=arr[i];

        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna