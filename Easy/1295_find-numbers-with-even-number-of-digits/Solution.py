class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        
        even = 0

        for i in nums:

            if (len(f"{i}") % 2) == 0:
                even += 1
            else: 
                pass
        
        return even


        