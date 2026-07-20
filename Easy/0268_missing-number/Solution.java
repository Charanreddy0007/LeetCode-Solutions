class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int current = i;
            boolean is_present = false;

            for (int j = 0; j < nums.length; j++){
                if (current == nums[j]){
                    is_present = true;
                    break;
                }
            }

            if (is_present == false){
                return i;
            }
        }

        return nums.length;
    }
}