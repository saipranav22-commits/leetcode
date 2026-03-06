class Solution {
    static int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null || matrix.length==0)return 0;
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        int maxlen=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maxlen=Math.max(maxlen,dfs(matrix,i,j,n,m,dp));
            }
        }
        return maxlen;
    }
    static int dfs(int mat[][],int i,int j,int n,int m,int dp[][]){
       if(dp[i][j]!=0)return dp[i][j];
       int max=1;
       for(int []d:dir){
        int x=i+d[0];
        int y=j+d[1];

        if(x>=0 && y>=0 && x<n && y<m && mat[x][y]>mat[i][j]){
            max=Math.max(max,1+dfs(mat,x,y,n,m,dp));
        }
       }
       dp[i][j]=max;
       return max;
    }
}