class Solution {
    public String minWindow(String s, String t) {
        int st=0;
        int l=0;
        int min=Integer.MAX_VALUE;
        int []fre=new int[128];
        int req=t.length();
        for(int i=0;i<t.length();i++){
           char c=t.charAt(i);
           fre[c]++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(fre[c]>0){
                req--;
            }
            fre[c]--;
            while(req==0){
                if((i-l+1)<min){
                    min=i-l+1;
                    st=l;
                }
                char ch=s.charAt(l);
                fre[ch]++;
                if(fre[ch]>0){
                    req++;
                }
                l++;
            }
        }
        if(min!=Integer.MAX_VALUE){
            return s.substring(st,st+min);
        }else{
            return "";
        }
    }
}