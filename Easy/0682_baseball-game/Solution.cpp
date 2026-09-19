#include <vector>
#include <string>

class Solution {
public:
    int calPoints(std::vector<std::string>& operations) {
        std::vector<int> stack;
        for (const std::string& op : operations) {
            if (op == "C") {
                stack.pop_back();
            } else if (op == "D") {
                stack.push_back(2 * stack.back());
            } else if (op == "+") {
                int n = stack.size();
                stack.push_back(stack[n - 1] + stack[n - 2]);
            } else {
                stack.push_back(std::stoi(op));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
};