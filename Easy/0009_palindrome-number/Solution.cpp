class Solution {
public:
    bool isPalindrome(int x) {

        int num = x;
        long reversed = 0;

        if (x >= 0){

            while (x != 0){
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }        

            if (num == reversed){
                return true;
            }
            else {
                return false; 
            }
        }
        else {
            return false;
        }
    }
};