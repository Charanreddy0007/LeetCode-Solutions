class Solution:
    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        start_hou = int(startTime[0] + startTime[1]) * 3600
        start_min = int(startTime[3] + startTime[4]) * 60 
        start_sec = int(startTime[6] + startTime[7]) 

        start_time = start_hou + start_min + start_sec

        end_hou = int(endTime[0] + endTime[1]) * 3600
        end_min = int(endTime[3] + endTime[4]) * 60
        end_sec = int(endTime[6] + endTime[7]) 

        end_time = end_hou + end_min + end_sec

        #return start_time
        return abs(end_time - start_time)

        