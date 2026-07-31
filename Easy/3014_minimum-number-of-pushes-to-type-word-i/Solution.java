class Solution {
    public int minimumPushes(String word) {
        int length = word.length();

        if (length <= 8){
            return length;
        } 

        else if (length <= 16){
            return (8 + (length-8)*2);
        }

        else if (length <= 24){
            int second = (8 + 8*2 + (length-16)*3);
            return (second);
        }

        else {
            int third = (8 + 8*2 + 8*3 + (length-24)*4);
            return (third);
        }

    }
}