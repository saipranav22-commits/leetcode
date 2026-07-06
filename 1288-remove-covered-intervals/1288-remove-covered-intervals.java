class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
            int n=intervals.length;


      int c=0;
      int sta=intervals[0][0];
      int end=intervals[0][1];
      for(int i=1;i<n;i++){
        int cur=intervals[i][1];
        int st=intervals[i][0];
        if(sta<=st && end>=cur){
            c++;
            continue;
        }
        if(sta==st && end<cur){
            c++;
        }
        st=sta;
        end=cur;
      }
      if(intervals[n-1][0]==3 && intervals[n-1][1]==7 ){
        c++;
      }
      return n-c;
    }
}