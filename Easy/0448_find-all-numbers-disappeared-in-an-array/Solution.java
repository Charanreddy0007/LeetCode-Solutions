class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] -1;
            if (nums[correct] != nums[i]){
                int temp =  nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        List<Integer> arr = new ArrayList<>();

        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j+1){
                arr.add(j+1);
            }
        }

        return arr;
    }
}