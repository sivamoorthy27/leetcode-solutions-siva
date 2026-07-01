class Solution {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        int[] arr = new int[nums.length];

        int k = 0;

        for(int i = 0; i < nums.length; i += 2){
            arr[k++] = nums[i+1];
            arr[k++] = nums[i];
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna