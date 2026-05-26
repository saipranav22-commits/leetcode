class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        HashSet<Character>map=new HashSet<>();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            char ch=Character.toLowerCase(c);
            char che=Character.toUpperCase(c);
            if(map.contains(ch)  && !set.contains(c)){
             ans++;
            }

            if(map.contains(che) && !set.contains(c)){
             ans++;
            }
            map.add(c);
            set.add(c);
            
        }
        return ans;
    }
}