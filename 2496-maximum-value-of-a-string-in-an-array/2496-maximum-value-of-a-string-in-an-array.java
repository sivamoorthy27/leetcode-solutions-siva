class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;

        for (String s : strs) {

            boolean isNumber = true;

            for (int j = 0; j < s.length(); j++) {
                if (!Character.isDigit(s.charAt(j))) {
                    isNumber = false;
                    break;
                }
            }

            if (isNumber) {
                int num = Integer.parseInt(s);
                max = Math.max(max, num);
            } else {
                max = Math.max(max, s.length());
            }
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna