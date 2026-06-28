class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occ, int st, int end) {
        List<List<Integer>>res=new ArrayList<>();

        int n=occ.length;

        List<int[]>l=new ArrayList<>();

        Arrays.sort(occ,(a,b)->Integer.compare(a[0],b[0]));

        int prev[]=occ[0];


        for(int i=1;i<n;i++){
            int cur[]=occ[i];

            if(cur[0]<=prev[1]+1){
                prev[1]=Math.max(cur[1],prev[1]);
            }else{
                l.add(prev);
                prev=cur;
            }
        }
        l.add(prev);


        for(int i[]:l){
            int x=i[0];
            int y=i[1];

            if(y<st || x>end){
                res.add(Arrays.asList(x,y));
            }else{
                if(x<st){
                    res.add(Arrays.asList(x,st-1));
                }
                if(y>end){
                    res.add(Arrays.asList(end+1,y));
                }

            }

        }


        return res;
    }
}