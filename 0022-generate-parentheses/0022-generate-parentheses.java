class Solution {
    public List<String> generateParenthesis(int n) {
        char[] cur=new char[2*n];
        List<String> res=new ArrayList<>();
        backtracking(0,0,0,cur,res,n);
        return res;
    }
    static void backtracking(int start,int open,int close,char[] cur,List<String> res,int n){
        if(start==2*n){
            res.add(new String(cur));
            return;
        }
        if (open<n){
            cur[start]='(';
            backtracking(start+1,open+1,close,cur,res,n);
        }
        if (close<open){
            cur[start]=')';
            backtracking(start+1,open,close+1,cur,res,n);
        }
    }
}