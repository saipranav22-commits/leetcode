class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        TreeMap<Character,Integer>fre=new TreeMap<>();
        for(char c:s.toCharArray()){
            fre.merge(c,1,Integer::sum);
        }
        for(char c:t.toCharArray()){
            Integer val=fre.merge(c,-1,Integer::sum);
            if(val==null || val<0){
                return false;
            }
        }
        return true;
    }
}