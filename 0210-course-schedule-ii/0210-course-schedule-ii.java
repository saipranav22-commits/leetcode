class Solution {
    public int[] findOrder(int n, int[][] pre) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<pre.length;i++){
          int u=pre[i][0];
          int v=pre[i][1];
          map.putIfAbsent(u,new ArrayList<>());
          map.putIfAbsent(v,new ArrayList<>());
          map.get(v).add(u);
        }

        int in[]=new int[n];

        for(int key:map.keySet()){
        for(int nei:map.get(key)){
            in[nei]++;
        }
       }

        Queue<Integer>q=new LinkedList<>();

        for(int i = 0; i < n; i++){
             if(in[i] == 0){
              q.add(i);
            }
        }
        int count=0;
        int ans[]=new int[n];
        while(!q.isEmpty()){
            int cur=q.poll();
            ans[count++]=cur;
            if(!map.containsKey(cur)){
                continue;
            }
            for(int add:map.get(cur)){
                in[add]--;
                if(in[add]==0){
                    q.add(add);
                }
            }
        }
        if(count!=n)return new int[0];
        return ans;
    }
}