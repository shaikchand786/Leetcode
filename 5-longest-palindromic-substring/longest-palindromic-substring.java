class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
        boolean[][] dp = new boolean[n][n]; //dp[i][j] = true means the substring from index i to j is a palindrome
        String longest = "";
        for (int len = 1; len <= n; len++) 
        {
            for (int i = 0; i <= n - len; i++)
            {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) 
                {
                    if (len <= 2 || dp[i + 1][j - 1])
                    {
                        dp[i][j] = true;

                        if (len > longest.length()) {
                            longest = s.substring(i, j + 1);
                        }
                    }
                }
            }
        }
        return longest;
    }
}