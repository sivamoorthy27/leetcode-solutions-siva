class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[]=new int[2];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>arr[1]){
                arr[1]=c;
                arr[0]=i;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna