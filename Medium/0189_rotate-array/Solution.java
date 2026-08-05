class Solution {
    public void rotate(int[] nums, int k) {

        k %= nums.length;
        
        if (k == 0) {
            return;
        }

        int[] elements = nums.clone();


        for (int i = 0; i < k; i++){
            nums[i] = elements[nums.length-k+i];
        }

        for (int i = k; i < nums.length; i++){
            nums[i] = elements[i-k];
        }

    }
}