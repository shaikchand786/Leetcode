import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int left = 0;
        
        // To store characters in current window
        Set<Character> set = new java.util.HashSet<>();
        
        for (int right = 0; right < s.length(); right++) {
            // If duplicate found, shrink window from left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add current character
            set.add(s.charAt(right));
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}