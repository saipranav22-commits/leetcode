class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int mat[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i==j)continue;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;

            while(l<r){
              int temp=matrix[i][l];
              matrix[i][l]=matrix[i][r];
              matrix[i][r]=temp;
              l++;
              r--;
            }
        }

    }
}