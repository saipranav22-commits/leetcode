class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      int prev[]=intervals[0];
      List<int[]>res=new ArrayList<>();
      for(int i=1;i<intervals.length;i++){
        int current[]=intervals[i];
        if(current[0]<=prev[1]){
            prev[1]=Math.max(prev[1],current[1]);
        }else{
            res.add(prev);
            prev=current;
        }
      } 
      res.add(prev);
      return res.toArray(new int[res.size()][]);
    }
}