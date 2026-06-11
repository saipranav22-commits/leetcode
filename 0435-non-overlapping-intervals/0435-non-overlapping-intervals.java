class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int n=intervals.length;
        int m=intervals[0].length;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
        
        int last=intervals[0][1];

        for(int i=1;i<n;i++){
            if(last>intervals[i][0]){
            ans++;
            }else{
                last=intervals[i][1];
            }
        }

        return ans;
    }
}