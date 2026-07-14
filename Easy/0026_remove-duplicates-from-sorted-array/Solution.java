class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 0;
        int last  = 0;
        int pointer  = 0;

        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                nums[count] = nums[i];
                last = nums[i];
                count++;
            }
            else if (last != nums[i]){
                nums[count] = nums[i];
                last = nums[i];
                count++;
            }

        }

        return count;
    }
}