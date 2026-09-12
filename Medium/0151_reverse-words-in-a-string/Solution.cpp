#include <string>
#include <vector>
#include <sstream>

class Solution {
public:
    std::string reverseWords(std::string s) {
        std::stringstream ss(s);
        std::string word;
        std::vector<std::string> words;
        while (ss >> word) {
            words.push_back(word);
        }
        int left = 0;
        int right = words.size() - 1;
        while (left < right) {
            std::string temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        std::string result = "";
        for (int i = 0; i < words.size(); i++) {
            result += words[i];
            if (i < words.size() - 1) {
                result += " ";
            }
        }
        return result;
    }
};