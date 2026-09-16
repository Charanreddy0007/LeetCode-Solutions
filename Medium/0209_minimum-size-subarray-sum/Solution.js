/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    let left = 0;
    let right = 0;
    let sum = 0;
    let min = Infinity;

    while (right < nums.length) {
        sum += nums[right];

        while (sum >= target) {
            if (min > (right - left + 1)) {
                min = right - left + 1;
            }

            sum -= nums[left];
            left++;
        }
        right++;
    }

    if (min === Infinity) {
        return 0;
    }

    return min;
};