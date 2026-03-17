class Solution {
    static List<String>res;
    static char car[];
    static void bt(int open,int close,int start,int n){
       if(start==2*n){
        res.add(new String(car));
        return;
       }

       if(open<n){
        car[start]='(';
        bt(open+1,close,start+1,n);
       }

       if(close<open){
        car[start]=')';
        bt(open,close+1,start+1,n);
       }
    }
    public List<String> generateParenthesis(int n) {
      car=new char[2*n];
      res=new ArrayList<>();
      bt(0,0,0,n);
      return res;
    }
}