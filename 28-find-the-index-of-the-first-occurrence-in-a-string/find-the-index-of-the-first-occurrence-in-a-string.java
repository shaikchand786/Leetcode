class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int i, j;

        // Loop through haystack
        for (i = 0; i <= n - m; i++) {
            // Check characters one by one
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // If all characters matched
            if (j == m) {
                return i;
            }
        }
        return -1; // if not found
    }
}