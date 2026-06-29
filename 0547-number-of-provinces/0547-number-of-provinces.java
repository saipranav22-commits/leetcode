class Solution {
    static boolean vis[];

    static void dfs(int[][]a,int st){
        vis[st]=true;

        for(int i=0;i<a.length;i++){
            if(a[st][i]==1){
                if(!vis[i]){
                    dfs(a,i);
                }
            }
        }
    }
    public int findCircleNum(int[][] a) {
        vis=new boolean[a.length];

        int count=0;

        for(int i=0;i<a.length;i++){
            if(!vis[i]){
               count++;
               dfs(a,i);
            }
        }
    return count;    
    }
}