class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < stones.length; i++) {
            a.add(stones[i]);
        }

        while (a.size() > 1) {
            int f = Integer.MIN_VALUE;
            int s = Integer.MIN_VALUE;

            for (int b : a) {
                if (b > f) {
                    s = f;
                    f = b;
                } else if (b > s) {
                    s = b;
                }
            }

            a.remove(Integer.valueOf(f));
            a.remove(Integer.valueOf(s));

            if (f != s) {
                a.add(f - s);
            }
        }

        return a.size() == 0 ? 0 : a.get(0);
    }
}