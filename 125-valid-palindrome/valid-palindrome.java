class Solution {
    public static boolean isPalindrome(String s) {

        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");   //Removes all characters except 'not a to z & 0 to 9'.

        // Reverse the string
        String reversed = new StringBuilder(s).reverse().toString();

        // Compare original and reversed strings
        return s.equals(reversed);
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";    
        String s2 = "my name is Aman";
        String s3 = " ";

        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false
        System.out.println(isPalindrome(s3)); // true
    }
}