class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Copy nums2 elements into nums1
        for i in range(n):
            nums1[m + i] = nums2[i]
        nums1.sort()
# Input
nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3

# Create object
obj = Solution()
# Call function
obj.merge(nums1, m, nums2, n)

# Print output
print(nums1)