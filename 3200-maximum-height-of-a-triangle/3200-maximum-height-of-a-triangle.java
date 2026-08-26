class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(build(red, blue), build(blue, red));
    }

    int build(int first, int second) {
        int height = 0;

        for (int row = 1; ; row++) {
            if (row % 2 == 1) {
                if (first < row) break;
                first -= row;
            } else {
                if (second < row) break;
                second -= row;
            }

            height++;
        }

        return height;
    }
}