class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            int index = (i + k) % s.length();
            ans.append(s.charAt(index));
            i++;
        }

        return ans.toString();
    }
}