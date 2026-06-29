class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String a = String.format("%04d", num1);
        String b = String.format("%04d", num2);
        String c = String.format("%04d", num3);
            String d = "";

        for(int i = 0; i < 4; i++){
            char min = (char)Math.min(a.charAt(i),
                         Math.min(b.charAt(i), c.charAt(i)));

            d+= min;
        }

        return Integer.parseInt(d);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna