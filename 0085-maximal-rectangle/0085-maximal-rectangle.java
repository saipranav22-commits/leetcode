class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
           
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=matrix[i][j]-'0';
            }
        }

        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==1)
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                int wid=mat[i][j];

                if(wid==0)continue;
                 int curwid=wid;
                for(int k=i;k<n && mat[k][j]>0 ;k++){
                    curwid=Math.min(curwid,mat[k][j]);
                    int height=k-i+1;
                    ans=Math.max(ans,curwid*height);
                }

                curwid=wid;
                for(int k=i;k>=0 && mat[k][j]>0 ;k--){
                    curwid=Math.min(curwid,mat[k][j]);
                    int height=i-k+1;
                    ans=Math.max(ans,curwid*height);
                }
            }
        }
        return ans;
    }
}