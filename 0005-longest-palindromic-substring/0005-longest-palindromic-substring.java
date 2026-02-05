 class Solution {
    static String expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String maxs = s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            if(odd.length()>maxs.length()){
                maxs=odd;
            }
            if(even.length()>maxs.length()){
                maxs=even;
            }
        }
        
        return maxs;
    }
} 