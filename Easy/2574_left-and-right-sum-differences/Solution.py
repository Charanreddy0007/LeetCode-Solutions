class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        
        length = len(nums)
        leftsum = []
        rightsum = [0] * length
        answer = []

        for i in range(0, length):
            if i == 0:
                leftsum.append(0)
            else:
                num = leftsum[i-1] + nums[i-1]
                leftsum.append(num)

        for i in range(length -1, -1, -1):

            if i == (length -1):
                rightsum[i] = 0

            else:
                num = rightsum[i+1] + nums[i+1]
                rightsum[i] = num
        
        for i in range(0, length):
            ans = abs(leftsum[i] - rightsum[i])
            answer.append(ans)
        
        return answer