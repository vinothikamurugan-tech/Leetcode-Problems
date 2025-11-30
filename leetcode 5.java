class Solution {
     private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true; 
    }

    public String longestPalindrome(String s) {
        int maxLen = 1; 
        int startIndex = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j - i + 1 > maxLen && isPalindrome(s, i, j)) {
                    maxLen = j - i + 1;
                    startIndex = i;
                }
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }
}