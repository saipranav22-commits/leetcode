class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            char ch=(char)(c+32);
            char che=(char)(c-32);
            if(Character.isUpperCase(c) && map.containsKey(ch) && !set.contains(c)){
             ans++;
            }

            if(Character.isLowerCase(c) && map.containsKey(che) && !set.contains(c)){
             ans++;
            }
            map.put(c,map.getOrDefault(c,0)+1);
            set.add(c);
            
        }
        return ans;
    }
}