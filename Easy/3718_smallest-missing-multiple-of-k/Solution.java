class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        for (int i = k; ; i+=k){

            boolean present = false;

            for (int j = 0; j < nums.length; j++){
                if (nums[j] == i){
                    present = true;
                    break;
                }
            }

            if (!present) {
                return i;
            }
            
        }

    }
}