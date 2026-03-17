class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int pre[]=intervals[0];
        List<int[]>res=new ArrayList<>();
        for(int i=01;i<intervals.length;i++){
            int current[]=intervals[i];

            if(current[0]<=pre[1]){
                pre[1]=Math.max(pre[1],current[1]);
            }else{
            res.add(pre);
            pre=current;
            }
        }
       res.add(pre);
       return res.toArray(new int[res.size()][]); 
    }
}