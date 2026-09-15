import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;

        int light = 0;
        int heavy = people.length -1;

        while (light <= heavy){
            if (people[light] + people[heavy] <= limit){
                light++;
                heavy--;
            } else {
                heavy--;
            }
            count++;
        }
        
        return count;

    }
}