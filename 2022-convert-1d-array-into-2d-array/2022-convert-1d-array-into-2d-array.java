class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n)
            return new int[0][0];
        int[][]a=new int[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){  
                a[i][j]=original[k];
                k++;
            }
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna