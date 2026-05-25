class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer>q=new LinkedList<>();
        boolean visited[]=new boolean[s.length()];

        q.add(0);
        visited[0]=true;
        int far=0;

        if(s.charAt(s.length()-1)=='1')return false;

        while(!q.isEmpty()){
            int ind=q.poll();
            
            int st=Math.max(ind+minJump,far+1);
            int end=Math.min(ind+maxJump,s.length()-1);

            for(int i=st;i<=end;i++){
                if(visited[i])continue;

                if(s.charAt(i)=='0'){

                if(i==s.length()-1)return true;
                visited[i]=true;
                q.add(i);

                }
            }
            far=end;
        }
        return false;
    }
}