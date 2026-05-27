class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int ans=0;

        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            map.put(c,i);
        }
        HashSet<Character>set=new HashSet<>();

        for(int i=0;i<n;i++){

            char c=word.charAt(i);

            if(Character.isUpperCase(c)){
                char ch=Character.toLowerCase(c);
                if(map.containsKey(ch) && map.get(ch)<i && !set.contains(c)){
                    ans++;
                }
                set.add(c);
            }
            
        }
        System.out.print(map);
        return ans;
        
    }
}