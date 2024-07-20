class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] result = new int[m][n];
        
        int i = 0; //row
        int j = 0; //col
        
        while(i < m && j < n){
            int value = Math.min(rowSum[i], colSum[j]);
            result[i][j] = value;
            rowSum[i] -= value;
            colSum[j] -= value;
            
            if(rowSum[i] == 0) i++;
            if(colSum[j] == 0) j++;
            
        }
        return result;
    }
}