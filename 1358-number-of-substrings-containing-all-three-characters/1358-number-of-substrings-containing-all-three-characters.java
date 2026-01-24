class Solution {
    public int numberOfSubstrings(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       int res=0;
       int st=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
        while(map.size()==3){
            res+=s.length()-i;
            char ch=s.charAt(st);
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
            st++;
        }
       } 
       return res;
    }
}