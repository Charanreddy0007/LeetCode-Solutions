#include <vector>

class Solution {
public:
    int numOfSubarrays(std::vector<int>& arr, int k, int threshold) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= threshold * k) {
            count++;
        }

        for (int i = k; i < arr.size(); i++) {
            sum -= arr[i - k];
            sum += arr[i];
            
            if (sum >= threshold * k) {
                count++;
            }
        }

        return count;
    }
};