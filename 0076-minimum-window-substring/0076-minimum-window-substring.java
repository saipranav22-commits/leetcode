class Solution {
    public String minWindow(String s, String t) {
      int st=0;
      int l=0;
      int min=Integer.MAX_VALUE;
      int req=t.length();
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<t.length();i++){
        char c=t.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
      }  
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(map.containsKey(c)){
            if(map.get(c)>0)
            req--;
            map.put(c,map.getOrDefault(c,0)-1);
        }
        while(req==0){
            if((i-l+1)<min){
            min=i-l+1;
            st=l;
            }
            char ch=s.charAt(l);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            
            if(map.get(ch)>0){
                req++;
            }
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