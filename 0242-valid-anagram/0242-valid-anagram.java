class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        TreeMap<Character,Integer>fre=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        fre.put(c,fre.getOrDefault(c,0)+1);
        }
         for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!fre.containsKey(c)||fre.get(c)==0){
              return false;  
            }
            fre.put(c,fre.getOrDefault(c,0)-1);
        }
        return true;
    }
}