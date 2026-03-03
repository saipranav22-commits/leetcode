class Solution {
    static boolean pal(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static void bt(int st,List<List<String>>res,String s,List<String>l){
        if(st==s.length()){
           List<String>cp=new ArrayList<>(l);
            res.add(cp);
        }
        for(int i=st;i<s.length();i++){
          if(pal(s.substring(st,i+1))){
            l.add(s.substring(st,i+1));
             bt(i+1,res,s,l);
            l.remove(l.size()-1);
          }
        }
    }
    public List<List<String>> partition(String s) {
       List<List<String>>res=new ArrayList<>();
       List<String>l=new ArrayList<>();
       bt(0,res,s,l);
       return res;     
    }
}