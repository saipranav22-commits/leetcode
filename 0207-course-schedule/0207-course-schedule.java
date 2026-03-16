class Solution {
    public boolean canFinish(int n, int[][] pre) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
       for(int i=0;i<pre.length;i++){
        int u=pre[i][0];
        int v=pre[i][1];
        map.putIfAbsent(u,new ArrayList<>());
        map.putIfAbsent(v,new ArrayList<>());
        map.get(u).add(v);
       } 
       int in[]=new int[n];

       for(int key:map.keySet()){
        for(int nei:map.get(key)){
            in[nei]++;
        }
       }
       Queue<Integer>q=new LinkedList<>();
       int count=0;

       for(int i=0;i<n;i++){
        if(in[i]==0){
            q.add(i);
        }
    }
       while(!q.isEmpty()){
        int key=q.poll();
        count++;
        if(!map.containsKey(key)){
            continue;
        }
        for(int add:map.get(key)){
            in[add]--;
            if(in[add]==0){
               q.add(add);
            }
        }
       }
       return count==n;
    }
}