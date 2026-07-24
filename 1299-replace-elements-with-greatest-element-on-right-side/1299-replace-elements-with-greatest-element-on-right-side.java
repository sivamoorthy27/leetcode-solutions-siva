class Solution {
    public int[] replaceElements(int[] arr) {
        int a[]=new int[arr.length];
        a[a.length-1]=-1;
        for(int i=0;i<arr.length-1;i++){
             int g=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>g)g=arr[j];    
            }
            a[i]=g;
        }
        return a;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna