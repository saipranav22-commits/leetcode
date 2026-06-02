class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length+1][amount+1];
        Arrays.fill(dp[0],amount+1);
        dp[0][0]=0;
        for(int i=1;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1);
            }
        }
        if(dp[coins.length][amount]>amount)return -1;
        return dp[coins.length][amount];
    }
}