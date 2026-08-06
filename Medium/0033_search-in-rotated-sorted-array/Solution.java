class Solution {
    public int search(int[] nums, int target) {
        int pvert = nums.length-1;

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] > nums[i+1]){
                pvert = i;
                break;
            }
        }    

        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pvert);
        } else {
            return binarySearch(nums, target, pvert+1, nums.length-1);
        }
        
    }

    static int binarySearch(int[] nums, int target, int start, int end){


        while (start <= end ){
            int mid = (start + end) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } 
            else if (target > nums[mid]){
                start = mid + 1;
            } 
            else {
                return mid;
            }
        }


        return -1;
    }
}