class Solution {
    static boolean solve(char board[][]){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(valid(board,row,col,num)){
                            board[row][col]=num;
                            if(solve(board)){
                                return true;
                            }
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean valid(char[][]board,int r,int c,char num){
        for(int i=0;i<9;i++){
            if(board[r][i]==num|| board[i][c]==num)return false;
        }
        int startrow=(r/3)*3;
        int startcol=(c/3)*3;
        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
       solve(board); 
    }
}