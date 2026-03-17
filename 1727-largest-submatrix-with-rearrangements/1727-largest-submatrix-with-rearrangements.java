class Solution {
    public int largestSubmatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==1){
                    matrix[i][j]+=matrix[i-1][j];
                 }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            Arrays.sort(matrix[i]);
            for(int j=0;j<matrix[0].length;j++){
                max=Math.max(max,matrix[i][j]*(matrix[0].length-j));
            }
        }
        return max;
    }
}