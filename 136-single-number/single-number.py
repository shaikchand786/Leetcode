class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        # XOR all elements
        for num in nums:
            result = result ^ num
        return result

# Create object
obj = Solution()

# Example Inputs
nums1 = [2, 2, 1]
nums2 = [4, 1, 2, 1, 2]
nums3 = [1]

# Print Outputs
print(obj.singleNumber(nums1))  # 1
print(obj.singleNumber(nums2))  # 4
print(obj.singleNumber(nums3))  # 1