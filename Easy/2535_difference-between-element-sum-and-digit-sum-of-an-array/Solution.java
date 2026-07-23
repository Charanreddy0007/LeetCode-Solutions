class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum_element = 0;
        int sum_digit = 0;

        for (int i : nums){
            sum_element += i;

            int temp = i;

            while (temp > 0) {
                sum_digit += temp % 10;
                temp /= 10;
            }

        }

        return Math.abs(sum_element - sum_digit);
    }
}