
class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() == t.length()) {
            char[] charArr1 = s.toCharArray();
            char[] charArr2 = t.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if (Arrays.equals(charArr1, charArr2)) {
                return true;
            }
        }

        return false;
    }
}
