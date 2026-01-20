class Solution {
    public int maxProduct(int[] nums) {
      int res=nums[0];
      int curmax=1;
      int curmin=1;
      for(int i:nums){
        int temp=curmax*i;
        curmax=Math.max(temp,Math.max(curmin*i,i));
        curmin=Math.min(temp,Math.min(curmin*i,i));
        res=Math.max(res,curmax);
      }
      return res;
    }
}