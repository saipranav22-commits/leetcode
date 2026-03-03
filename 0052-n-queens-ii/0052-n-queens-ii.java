class Solution {
    char board[][];
    List<List<String>>res=new ArrayList<>();
    Set<Integer>col=new HashSet<>();
    Set<Integer>pos=new HashSet<>();
    Set<Integer>neg=new HashSet<>();
        public int totalNQueens(int n) {
        board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               board[i][j]='.';
            }
        }
        back(0,n);
        return res.size();
    }
    void back(int r,int n){
        if(r==n){
            List<String>l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            res.add(l);
            return;
        }
    for(int c=0;c<n;c++){
        if(!(col.contains(c)||pos.contains(r+c)||neg.contains(r-c))){
            board[r][c]='Q';
            col.add(c);
            pos.add(r+c);
            neg.add(r-c);
            back(r+1,n);
            board[r][c]='.';
            col.remove(c);
            pos.remove(r+c);
            neg.remove(r-c);
        }
    }
    }
}