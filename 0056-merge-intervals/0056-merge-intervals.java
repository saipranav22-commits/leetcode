class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int pre[]=intervals[0];
       
       List<int[]>res=new ArrayList<>();


        for(int i=1;i<intervals.length;i++){
           int cur[]=intervals[i];

           if(cur[0]<=pre[1]){
             pre[1]=Math.max(pre[1],cur[1]);
           }else{
            res.add(pre);
            pre=cur;
           }
        }

        res.add(pre);
    int ans[][]=new int[res.size()][2];

    int k=0;


    for(int t[]:res){
       ans[k][0]=t[0];
       ans[k][1]=t[1];
       k++;
    }

    
    return ans;
    }
}