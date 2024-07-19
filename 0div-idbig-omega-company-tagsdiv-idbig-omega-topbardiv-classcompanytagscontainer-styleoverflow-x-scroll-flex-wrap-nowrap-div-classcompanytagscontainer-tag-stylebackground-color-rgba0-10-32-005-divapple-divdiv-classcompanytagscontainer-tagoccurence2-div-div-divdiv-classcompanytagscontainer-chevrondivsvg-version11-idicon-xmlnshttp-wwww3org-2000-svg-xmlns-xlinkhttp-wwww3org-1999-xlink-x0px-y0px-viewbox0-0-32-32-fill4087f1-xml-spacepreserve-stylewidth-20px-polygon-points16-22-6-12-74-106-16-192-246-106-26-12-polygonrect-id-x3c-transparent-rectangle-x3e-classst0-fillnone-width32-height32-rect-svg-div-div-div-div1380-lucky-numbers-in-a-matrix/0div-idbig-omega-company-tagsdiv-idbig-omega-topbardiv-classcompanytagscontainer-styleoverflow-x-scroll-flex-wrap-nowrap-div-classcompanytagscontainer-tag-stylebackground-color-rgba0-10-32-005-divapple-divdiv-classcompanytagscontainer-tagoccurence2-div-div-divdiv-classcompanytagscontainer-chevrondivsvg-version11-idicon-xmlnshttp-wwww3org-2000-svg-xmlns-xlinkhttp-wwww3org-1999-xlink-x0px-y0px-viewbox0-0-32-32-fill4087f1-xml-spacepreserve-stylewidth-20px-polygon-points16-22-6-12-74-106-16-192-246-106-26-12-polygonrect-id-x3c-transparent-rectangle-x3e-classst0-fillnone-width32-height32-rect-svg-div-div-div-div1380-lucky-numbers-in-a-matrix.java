class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int N = matrix.length, M = matrix[0].length;

        List<Integer> rowmin = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int rmin = Integer.MAX_VALUE;
            for(int j = 0; j <M;j++){
                rmin = Math.min(rmin, matrix[i][j]);
            }
            rowmin.add(rmin);
        }
        List<Integer> colmax = new ArrayList<>();
        for(int i =0; i<M; i++){
            int cmax = Integer.MIN_VALUE;
            for(int j =0; j<N; j++){
                cmax = Math.max(cmax, matrix[j][i]);
            }
            colmax.add(cmax);
        }
        List<Integer> luckynos = new ArrayList<>();
        for(int i =0; i< N; i++){
            for(int j =0; j<M; j++){
                if(matrix[i][j] == rowmin.get(i) && matrix[i][j] == colmax.get(j)){
                    luckynos.add(matrix[i][j]);
                }
            }
        }
        return luckynos;
    }
}