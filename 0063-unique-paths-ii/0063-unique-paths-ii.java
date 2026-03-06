class Solution {
    public int uniquePathsWithObstacles(int[][]Grid) {
       int dp[][]=new int[Grid.length][Grid[0].length];
       if(Grid[0][0]==1)return 0;
       else
       dp[0][0]=1; 
       for(int i=0;i<Grid.length;i++){
        for(int j=0;j<Grid[0].length;j++){
            if(Grid[i][j]==1){
                dp[i][j]=0;
                continue;
            }
           if(i>0){
            dp[i][j]+=dp[i-1][j];
           }
           if(j>0){
            dp[i][j]+=dp[i][j-1];
           }
        }
       }
       return dp[Grid.length-1][Grid[0].length-1];
    }
}