class Solution {

    static long count;
    static HashMap<Integer,List<Integer>>map;
    static boolean vis[];


    static void dfs(int st){

        vis[st]=true;

        count++;

        if(map.containsKey(st)){
            for(int i:map.get(st)){
                if(!vis[i]){
                    dfs(i);
                }
            }
        }
    }
    
    public long countPairs(int n, int[][] edges) {

        map=new HashMap<>();
        vis=new boolean[n];


        for(int i=0;i<edges.length;i++){

            int u=edges[i][0];
            int v=edges[i][1];

            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());

            map.get(u).add(v);
            map.get(v).add(u);
        }

        List<Long>l=new ArrayList<>();

        for(int i=0;i<n;i++){
            count=0;
            if(!vis[i]){
                dfs(i);
            }
            l.add(count);
        }

        long ans=0;

        for(long i:l){
            long rem=n-i;
            ans+=i*rem;
            n-=i;
        }

        return ans;   
    }
}