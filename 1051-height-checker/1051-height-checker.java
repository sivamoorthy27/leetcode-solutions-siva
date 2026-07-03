class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for (int j= 0; j< heights.length; j++) {
            arr[j] = heights[j];
}
Arrays.sort(arr);  

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]) {
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna