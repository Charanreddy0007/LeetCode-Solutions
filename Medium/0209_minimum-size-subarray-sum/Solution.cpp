#include <vector>
#include <climits>

class Solution {
public:
    int minSubArrayLen(int target, std::vector<int>& nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min_len = INT_MAX;

        while (right < nums.size()) {
            sum += nums[right];

            while (sum >= target) {
                if (min_len > (right - left + 1)) {
                    min_len = right - left + 1;
                }

                sum -= nums[left];
                left++;
            }
            right++;
        }

        if (min_len == INT_MAX) {
            return 0;
        }

        return min_len;
    }
};