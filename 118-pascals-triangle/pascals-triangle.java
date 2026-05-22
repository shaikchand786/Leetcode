import java.util.*;
class Solution {
    public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) 
        {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i)
                {
                    row.add(1);
                } 
                else{
                    // Sum of above two numbers
                    //Pascal Triangle Rule: Every middle number is created by "Upper Left Number + Upper Right Number".
                    //2D Array Method: Storing all values in an int[][] array and calculating arr[i][j] = arr[i-1][j-1] + arr[i-1][j].
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        int numRows = 5;

        System.out.println(generate(numRows));
    }
}