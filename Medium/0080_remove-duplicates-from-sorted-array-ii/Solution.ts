class Solution {
    removeDuplicates(nums: number[]): number {
        let slow: number = 2;
        for (let fast: number = 2; fast < nums.length; fast++) {
            if (nums[fast] !== nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}