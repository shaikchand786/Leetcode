class Solution {
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) 
        {
            int digit = x % 10; //Extract last digit using '% 10'
            x = x / 10;     //Remove last digit using '/ 10'

            // Check for overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) 
    {
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;

        System.out.println("Input: " + x1 + " Output: " + reverse(x1));
        System.out.println("Input: " + x2 + " Output: " + reverse(x2));
        System.out.println("Input: " + x3 + " Output: " + reverse(x3));

        // Reverse using StringBuilder built-in method:
        //String reversedStr = new StringBuilder(str).reverse().toString();
    }
}