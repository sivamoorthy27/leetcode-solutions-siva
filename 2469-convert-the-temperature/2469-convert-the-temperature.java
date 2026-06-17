class Solution {
    public double[] convertTemperature(double celsius) {
        double far=celsius*1.80+32.00;
        double kel=celsius+273.15;
        return new double[] {kel,far};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna