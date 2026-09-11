#include <vector>
#include <algorithm>

class Solution {
public:
    int maxArea(std::vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int max_val = 0;

        while (left < right) {
            int area = std::min(height[left], height[right]) * (right - left);

            if (area > max_val) {
                max_val = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max_val;
    }
};