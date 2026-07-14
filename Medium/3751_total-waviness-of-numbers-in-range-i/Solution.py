class Solution:
    def totalWaviness(self, num1: int, num2: int) -> int:

        waviness = 0

        for i in range(num1, num2 + 1):
            temp_1 = None
            temp_2 = None

            for j in str(i):

                if temp_1 is None:
                    temp_1 = int(j)
                    continue

                if temp_2 is None:
                    temp_2 = int(j)
                    continue
                
                if temp_1 is not None and temp_2 is not None:

                    if temp_1 < temp_2 and int(j) < temp_2:
                        waviness += 1
                        temp_1 = temp_2
                        temp_2 = int(j)
                        
                    elif temp_1 > temp_2 and int(j) > temp_2:
                        waviness += 1
                        temp_1 = temp_2
                        temp_2 = int(j)
                    else:
                        temp_1 = temp_2
                        temp_2 = int(j)

        return waviness


