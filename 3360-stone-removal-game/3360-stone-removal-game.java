class Solution {
    public boolean canAliceWin(int n) {

        int take = 10;
        boolean alice = true;

        while(n >= take) {
            n -= take;
            take--;

            alice = !alice;
        }

        return !alice;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna