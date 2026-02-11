class Solution {
    static  HashMap<Integer,List<Integer>>map;
    static boolean dfs(int n,boolean[]c){
       if(c[n]){
        return false;
       }
       if(!map.containsKey(n)||map.get(n).size()==0){
        return true;
       }
       c[n]=true;
       for(int i:map.get(n)){
        if(dfs(i,c)==false){
            return false;
        }
       }
       c[n]=false;
       map.put(n,new ArrayList<>());
       return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // if(prerequisites.length==0){
        //     return true;
        // }
        map=new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
        }
        boolean []c=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
        if(!dfs(i,c)){
            return false;
        }
        }
        return true;
    }
}