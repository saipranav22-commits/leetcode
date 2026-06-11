class Solution {
    private int dfs(List<List<Integer>>adj,int node,int parent){

        int depth=0;

        for(int child:adj.get(node)){

            if(child==parent){
                continue;
            }
            depth=Math.max(depth,dfs(adj,child,node)+1);
        }

        return depth;
    }
    
    public int assignEdgeWeights(int[][] edges) {
        int n=edges.length+1;

        List<List<Integer>>adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int e[]:edges){
            int u=e[0];
            int v=e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int depth=dfs(adj,1,-1);

        long res=1;
        int mod=(int)Math.pow(10,9)+7;

        for(int i=1;i<depth;i++){
            res=(res*2)%mod;
        }

        return (int)res;

    }
}