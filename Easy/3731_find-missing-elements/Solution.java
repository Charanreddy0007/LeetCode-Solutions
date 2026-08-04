class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

        ArrayList<Integer> result = new ArrayList<>();

        int count = 0;

        for (int i = min; i < max; i++){
            if (count < nums.length && nums[count] == i){
                count++;
            } else {
                result.add(i);
            }
        }

        return result;
    }
}