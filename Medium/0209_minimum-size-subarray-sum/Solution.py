class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        left = 0
        right = 0
        sum_val = 0
        min_len = float('inf')

        while right < len(nums):
            sum_val += nums[right]

            while sum_val >= target:
                if min_len > (right - left + 1):
                    min_len = right - left + 1

                sum_val -= nums[left]
                left += 1
            right += 1

        if min_len == float('inf'):
            return 0

        return min_len