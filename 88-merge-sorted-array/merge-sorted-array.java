import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy nums2 elements into nums1
        for (int i = 0; i < n; i++)
        {
            nums1[m + i] = nums2[i];    
        }
        // Sort the merged array
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print final merged array
        System.out.println(Arrays.toString(nums1));
    }
}