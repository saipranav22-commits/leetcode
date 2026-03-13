class Solution {
    public int climbStairs(int n) {
      int dp[]=new int[n];
      if(n<=2){
        return n;
      }
      dp[0]=1;
      dp[1]=2;
      for(int i=2;i<n;i++){
        dp[i]=dp[i-2]+dp[i-1];
        System.out.println(dp[i]);
      }
      return dp[n-1]; 
    }
}