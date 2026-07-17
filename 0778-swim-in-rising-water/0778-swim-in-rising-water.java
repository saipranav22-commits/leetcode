class Solution {
    public int swimInWater(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;

       int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};

       int dist[][]=new int[n][m];

       for(int i=0;i<n;i++){
        Arrays.fill(dist[i],Integer.MAX_VALUE);
       }

       
       PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
       pq.offer(new int[]{0,0,0});
       dist[0][0]=grid[0][0];

       while(!pq.isEmpty()){
        int cur[]=pq.poll();
        int u=cur[0];
        int v=cur[1];
        int wi=cur[2];

        if(u==n-1 && v==m-1){
            return wi;
        }

        if(wi>dist[u][v]){
            continue;
        }

        for(int d[]:dir){
            int i=u+d[0];
            int j=v+d[1];

            if(i>=0 && i<n && j>=0 && j<m){
              if(Math.max(dist[u][v],grid[i][j])<dist[i][j]){
                dist[i][j]=Math.max(dist[u][v],grid[i][j]);
                pq.offer(new int[]{i,j,dist[i][j]});
              }
            }
        }
       }

    //    for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         System.out.print(dist[i][j]+" ");
    //     }
    //     System.out.println();
    //    }
       return -1;

    }
}