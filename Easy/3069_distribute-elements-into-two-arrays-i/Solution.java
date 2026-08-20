import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int n = nums.length;

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < n; i++){
            if (arr1.getLast() > arr2.getLast()){
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            if (i < arr1.size()){
                result[i] = arr1.get(i);
            } else {
                result[i] = arr2.get(i-arr1.size());
            }
        }

        return result; 
    }
}