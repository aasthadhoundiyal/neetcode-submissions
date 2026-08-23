class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String str = "";

        // Keep only letters and numbers
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str += s.charAt(i);
            }
        }

        // Check palindrome
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
