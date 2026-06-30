class Solution {
    public int numberOfSubstrings(String s) {

        int n=s.length();
        int st=0;
        int ans=0;

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);

            while(map.size()==3){
                ans+=n-i;
                char ch=s.charAt(st);
                map.put(ch,map.getOrDefault(ch,0)-1);
                st++;
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
        }
        return ans;
    }
}