class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[0].length;j++){
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
        int pre[]=intervals[0];
        List<int[]>res=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
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