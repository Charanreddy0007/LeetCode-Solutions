class Solution {
    public int maximumWealth(int[][] accounts) {
        int welth = 0;

        for (int i = 0; i < accounts.length; i++){
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++){
                total = total + accounts[i][j];
            }
            if (welth < total){
                welth = total;
            }
        }

        return welth;
    }
}