class Solution {
    public static int back(int n,int m, int[][]grid,boolean vis[][],int i,int j,int sum){
      
      if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0 || vis[i][j]){
        return sum;
      }

      vis[i][j]=true;
      int up=back(n,m,grid,vis,i-1,j,sum+grid[i][j]);
      int down=back(n,m,grid,vis,i+1,j,sum+grid[i][j]);
      int left=back(n,m,grid,vis,i,j-1,sum+grid[i][j]);
      int right=back(n,m,grid,vis,i,j+1,sum+grid[i][j]);
      vis[i][j]=false;
      return Math.max(up,Math.max(down,Math.max(left,right)));
    }
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean vis[][]=new boolean[n][m];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max=Math.max(max,back(n,m,grid,vis,i,j,0));
            }
        }
        return max;
    }
}