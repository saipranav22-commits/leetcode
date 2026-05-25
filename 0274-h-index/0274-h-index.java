class Solution {
    public int hIndex(int[] cit) {
       Arrays.sort(cit);
       int ans=0;
       int st=1;
       for(int i=cit.length-1;i>=0;i--){
          if(cit[i]<st){
            break;
          }
          ans++;
          st++;
       }
       return ans;
    }
}