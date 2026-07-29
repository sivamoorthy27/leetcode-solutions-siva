class Solution {

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int[] half = new int[26];
        String mid = "";

        int halfLen = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLen += half[i];
            if ((freq[i] & 1) == 1)
                mid = String.valueOf((char) ('a' + i));
        }

        StringBuilder first = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {

            boolean found = false;

            for (int c = 0; c < 26; c++) {

                if (half[c] == 0)
                    continue;

                half[c]--;

                long ways = countWays(half, k);

                if (ways >= k) {
                    first.append((char) ('a' + c));
                    found = true;
                    break;
                }

                k -= ways;
                half[c]++;
            }

            if (!found)
                return "";
        }

        String second = new StringBuilder(first).reverse().toString();

        return first.toString() + mid + second;
    }

    private long countWays(int[] cnt, long limit) {

        int total = 0;

        for (int x : cnt)
            total += x;

        long ans = 1;

        for (int i = 0; i < 26; i++) {

            int c = cnt[i];

            if (c == 0)
                continue;

            ans *= comb(total, c, limit);

            if (ans > limit)
                return limit;

            total -= c;
        }

        return Math.min(ans, limit);
    }

    private long comb(int n, int r, long limit) {

        if (r > n)
            return 0;

        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;

            if (res > limit)
                return limit;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna