class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        while (i < nums.length){
            int current = nums[i]-1;
            if (nums[current] != nums[i]){
                int temp = nums[current];
                nums[current] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        return nums[nums.length-1];
    }
}