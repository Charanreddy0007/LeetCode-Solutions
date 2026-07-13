class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        
        stack = []

        for i in asteroids:

            if len(stack) == 0:
                stack.append(i)

            elif i > 0 and stack[-1] > 0:
                stack.append(i)
            
            elif i < 0 and stack[-1] < 0:
                stack.append(i)


            
            else: 
                for j in range(0, len(stack)):
                
                    if i < 0 and stack[-1] > 0:

                        if abs(i) > stack[-1]:
                            stack.pop()
                            if len(stack) == 0:
                                stack.append(i)
                            elif i < 0 and stack[-1] < 0:
                                stack.append(i)
                            elif i > 0 and stack[-1] > 0:
                                stack.append(i)

                        elif abs(i) < stack[-1]:
                            pass

                        elif abs(i) == abs(stack[-1]):
                            stack.pop()
                            break

                    elif i > 0  and stack[-1] < 0:
                        stack.append(i)                      

            
        return stack
