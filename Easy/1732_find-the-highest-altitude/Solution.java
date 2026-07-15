class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] new_gain = new int[gain.length+1];
        new_gain[0] = 0;

        for (int i =0; i < gain.length; i++){
            new_gain[i+1] = new_gain[i] + gain[i];
        }

        int max = 0;
        for (int i : new_gain){
            if (max < i){
                max = i;
            }
        }

        return max;

    }
}