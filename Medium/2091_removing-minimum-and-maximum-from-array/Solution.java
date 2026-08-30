class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int indmax = 0;
        int indmin = 0;

        for (int i = 0; i < n; i++){
            if (max < nums[i]){
                max = nums[i];
                indmax = i;
            } 
            if (min > nums[i]){
                min = nums[i];
                indmin = i;
            }
        }

        int left = 0;
        int right = 0;

        if (indmin < indmax){
            left = indmin;
            right = indmax;
        } else {
            left = indmax;
            right = indmin;
        }

        int scenario0 = right + 1;
        int scenario1 = n - left;
        int scenario2 = (left + 1) + (n - right);

        int ans = scenario0;

        if (scenario1 < ans){
            ans = scenario1;
        }

        if (scenario2 < ans){
            ans = scenario2;
        }

        return ans;
    }
}