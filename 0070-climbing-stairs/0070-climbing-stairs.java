class Solution {
    public int climbStairs(int n) {
      int dp[]=new int[n+2];
      if(n<=2){
        return n;
      }
      dp[0]=0;
      dp[1]=1;
      for(int i=2;i<=n+1;i++){
        dp[i]=dp[i-2]+dp[i-1];
        System.out.println(dp[i]);
      }
      return dp[n+1]; 
    }
}