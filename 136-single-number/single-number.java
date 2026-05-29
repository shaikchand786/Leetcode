class Solution {
    public static int singleNumber(int[] nums) {
        int result = 0;

        // XOR all elements
        for (int num : nums)
        {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Output: " + singleNumber(nums1));
        System.out.println("Output: " + singleNumber(nums2));
        System.out.println("Output: " + singleNumber(nums3));
    }
}