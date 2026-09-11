class Solution:
    def maxArea(self, height: list[int]) -> int:
        left = 0
        right = len(height) - 1
        max_val = 0

        while left < right:
            area = min(height[left], height[right]) * (right - left)

            if area > max_val:
                max_val = area

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_val