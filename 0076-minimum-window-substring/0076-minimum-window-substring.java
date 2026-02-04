class Solution {
    public String minWindow(String s, String t) {
      int[]b=new int[128];
      for(char c:t.toCharArray()){
        b[c]++;
      }  
      int st=0;
      int l=0;
      int min=Integer.MAX_VALUE;;
      int req=t.length();
      for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(b[c]>0){
        req--;
      }
      b[c]--;
      while(req==0){
        if((i-l+1)<min){
            min=i-l+1;
            st=l;
        }
        char ch=s.charAt(l);
        b[ch]++;
        if(b[ch]>0){
            req++;
        }
        l++;
      }     
      }
    if(min!=Integer.MAX_VALUE){
        return s.substring(st,st+min);
    }
    return "";
    }
}