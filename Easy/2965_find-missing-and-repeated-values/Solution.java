class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length * grid[0].length;
        int[] count = new int[n+1];

        for (int[] i : grid){
            for (int j : i) {
                count[j]++;
            }
        }

        int[] arr = new int[2];

        for (int i = 0; i <= n; i++){
            if (count[i] == 2){
                arr[0] = i;
            } 
            else if (count[i] == 0){
                arr[1] = i;
            }
        }

        return arr;
    }
}