class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<List<Integer>>q=new LinkedList<>();

        q.offer(Arrays.asList(0));
        int tar=graph.length-1;

        while(!q.isEmpty()){

            List<Integer>path=q.poll();
            int end=path.get(path.size()-1);

            if(end==tar){
                res.add(path);
                continue;
            }

            for(int nei:graph[end]){

                List<Integer>newpath=new ArrayList<>(path);
                newpath.add(nei);
                q.offer(newpath);

            }
        }
        return res;
    }
}