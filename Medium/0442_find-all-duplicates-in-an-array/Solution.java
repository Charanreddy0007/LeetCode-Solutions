class Solution {
    public List<Integer> findDuplicates(int[] nums) {

    int i = 0;
    while (i < nums.length){
       int current = nums[i]-1;
       if (nums[current] != nums[i]){
           int temp =  nums[current];
           nums[current] = nums[i];
           nums[i] = temp;
       } else {
           i++;
       }
    }

    List<Integer> ans  = new ArrayList<>();

    for (int j = 0; j < nums.length; j++){
        if (nums[j] != j+1){
            ans.add(nums[j]);
        }
    }

    return ans;

    }
}