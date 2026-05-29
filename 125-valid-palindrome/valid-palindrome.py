class Solution:
    def isPalindrome(self, s: str) -> bool:
        # Convert to lowercase and remove non-alphanumeric characters
        s = ''.join(char.lower() for char in s if char.isalnum())

        # Reverse the string
        reversed_string = s[::-1]

        # Compare original and reversed strings
        return s == reversed_string


# Create object
obj = Solution()

# Example Inputs
s1 = "A man, a plan, a canal: Panama"
s2 = "race a car"
s3 = " "

# Print Outputs
print(obj.isPalindrome(s1))   # True
print(obj.isPalindrome(s2))   # False
print(obj.isPalindrome(s3))   # True