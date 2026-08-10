class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long sc=0;
        int n=values.length;
        int i=0;
        boolean vis[]=new boolean[n];
        
        while(i>=0 && i<n  && !vis[i]){
            String s=instructions[i];
            vis[i]=true;
            if(s.equals("jump")){
                int val=values[i];
                values[i]=0;
                i+=val;
            }else if(s.equals("add")){
                sc+=values[i];
                values[i]=0;
                i++;
            }
            
        }
        return sc;
    }
}