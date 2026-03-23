class Solution {
    static HashMap<Integer,Integer>map;
    static boolean rec(int ind,int jump,int n,int []stones,int [][]dp){
        if(dp[ind][jump]!=-1){
            if(dp[ind][jump]==1)return true;
            return false;
        }
      if(ind==n-1){
        dp[ind][jump]=1;
        return true;
      }
      for(int i=jump-1;i<=jump+1;i++){
        if(i<=0){
            continue;
        }
        int next=stones[ind]+i;
        if(map.containsKey(next)){
            int nextind=map.get(next);
            if(rec(nextind,i,n,stones,dp)){
               dp[ind][i]=1; 
        return true;
        }
        }
    
      }
      dp[ind][jump]=0;
      return false;
    }
    public boolean canCross(int[] stones) {
        int n=stones.length;
        map=new HashMap<>();
        for(int i = 0; i < n; i++){
         map.put(stones[i], i);
    }
       int dp[][]=new int[n][n];
    for(int i = 0; i < n; i++){
    Arrays.fill(dp[i], -1);
   }      
   return rec(0,0,n,stones,dp); 
    }
}