class Solution {
    public int lengthOfLongestSubstring(String s) {
       int st=0;
       int max=0;
       HashSet<Character>set=new HashSet<>();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!set.contains(c)){
            max=Math.max(max,i-st+1);
        }
        while(set.contains(c)){
            char ch=s.charAt(st);
            set.remove(ch);
            st++;
        }
        set.add(c);
       }
       return max; 
    }
}