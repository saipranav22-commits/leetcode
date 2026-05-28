class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int len=n-1;
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[j][len]=matrix[i][j];
            }
            len--;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=mat[i][j];
            }
        }
    }
}