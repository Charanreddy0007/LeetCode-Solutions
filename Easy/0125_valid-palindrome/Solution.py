class Solution:
    def isPalindrome(self, s: str) -> bool:
        letters = s.lower()
        result_1 = ""

        for ch in letters:
            if ('a' <= ch <= 'z') or ('0' <= ch <= '9'):
                result_1 += ch 
        
        result_2 = result_1[::-1]

        if result_1 == result_2:
            return True
        else: 
            return False
        