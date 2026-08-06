class Solution {
    public int smallestNumber(int n, int t) {
        
        int num = n;

        while (true) {
            int product = 1;
            int temp = num;

            while (temp > 0) {
                product *= (temp % 10);
                temp /= 10;
            }

            if (num == 0) {
                product = 0;
            }

            if (product % t == 0) {
                return num;
            }

            num++;
        }
    }
}