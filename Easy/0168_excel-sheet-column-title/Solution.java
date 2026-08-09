class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder output = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;

            output.append((char) ('A' + remainder));

            columnNumber /= 26;
        }

        return output.reverse().toString();
    }
}