class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;

        for (int i = 0; i < nums.length; i++){
            int count = 0;
            int chose = nums[i];

            for (int j = 0; j < nums.length; j++){
                if (chose == nums[j]){
                    count++;
                }

                if (count > majority){
                    return chose;
                }
            }
        }

        return -1;
    }
}