class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>l=new ArrayList<>();
       HashMap<Character,Integer>a=new HashMap<>();
       HashMap<Character,Integer>b=new HashMap<>();
       for(char c:p.toCharArray()){
        b.put(c,b.getOrDefault(c,0)+1);
       }
       int st=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        a.put(c,a.getOrDefault(c,0)+1);
        if(i-st+1==p.length()){
            if(a.equals(b)){
                l.add(st);
            }
            a.put(s.charAt(st),a.getOrDefault(s.charAt(st),0)-1);
            if(a.get(s.charAt(st))==0){
                a.remove(s.charAt(st));
            }
            st++;
        }
       }
    return l;
    }
}