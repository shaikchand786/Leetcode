class Solution {
    public static int mySqrt(int x) {
      
      long i = 0;   //to avoid 'integer overflow'

        while (i * i <= x) {
            i++;
        }

        return (int)(i - 1);
    }

    public static void main(String[] args) 
    {
        int x =4;
        System.out.println(mySqrt(x));
    }
}