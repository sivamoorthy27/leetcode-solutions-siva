class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int left = 0;

        for (int i = 0; i < k; i++) {
            left += cardPoints[i];
        }

        int max = left;
        int right = 0;

        for (int i = 1; i <= k; i++) {

            left -= cardPoints[k - i];
            right += cardPoints[cardPoints.length - i];

            max = Math.max(max, left + right);
        }

        return max;
    }
}