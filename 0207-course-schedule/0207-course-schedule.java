class Solution {
    static HashMap<Integer,List<Integer>>map;
    static boolean check[];

    static boolean dfs(int i){
      if(check[i]){
        return false;
      }
      if(!map.containsKey(i) || map.get(i).size()==0){
        return true;
      }
     check[i]=true;
      for(int n:map.get(i)){
        if(dfs(n)==false){
            return false;
        }
      }
      check[i]=false;
      map.put(i,new ArrayList<>());
      return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    check=new boolean[numCourses];
    map=new HashMap<>();
    for(int i=0;i<prerequisites.length;i++){
       int u=prerequisites[i][0];
       int v=prerequisites[i][1];
       map.putIfAbsent(u,new ArrayList<>());
       map.putIfAbsent(v,new ArrayList<>());
       map.get(u).add(v);
    }
    for(int i=0;i<numCourses;i++){
        if(dfs(i)==false){
            return false;
        }
    }
    return true;
    }
}