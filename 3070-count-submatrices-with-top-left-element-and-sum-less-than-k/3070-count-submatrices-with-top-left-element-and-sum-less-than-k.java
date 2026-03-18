class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;

        int sum[][]=new int[n][m];

        sum[0][0]=grid[0][0];

        for(int i=1;i<n;i++){
            sum[i][0]=grid[i][0]+sum[i-1][0];
        }

        for(int i=1;i<m;i++){
            sum[0][i]=grid[0][i]+sum[0][i-1];
        }
         for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                sum[i][j]=grid[i][j]+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
            }
        }
         
        int ans=0;
        for(int i=0;i<n;i++){
            boolean stop=false;
            for(int j=0;j<m;j++){
                if(sum[i][j]<=k) ans++;
                else{if(j==0) stop=true; break;}
            }
            if(stop) break;
        }
        return ans;
    }
}