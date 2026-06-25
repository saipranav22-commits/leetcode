class Solution {
    public int orangesRotting(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;

        int min=-1;
        int orange=0;

        int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};

        int vis[][]=grid;

        Queue<int[]>q=new LinkedList<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(vis[i][j]==1){
                    orange++;
                }
            }
        }


        if(orange==0)return 0;

        if(q.isEmpty())return -1;


        while(!q.isEmpty()){
            int size=q.size();

            for(int k=0;k<size;k++){
               int cell[]=q.poll();
               int x=cell[0];
               int y=cell[1];

               for(int []d:dir){
                 int i=x+d[0];
                 int j=y+d[1];

                 if(i>=0 && i< n && j>=0 && j<m && vis[i][j]==1){
                    vis[i][j]=2;
                    q.add(new int[]{i,j});
                    orange--;
                 }
               }
            }
            min++;
        }
        if(orange==0)return min;

        return -1;
    }
}