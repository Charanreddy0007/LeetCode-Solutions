class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++){
            if (min > nums[i]){
                min = nums[i];
            }
            if (max < nums[i]){
                max = nums[i];
            }
        }

        while (max > 0){
            int rem = min % max;
            min = max;
            max = rem;
        }

        return min;

    }
}