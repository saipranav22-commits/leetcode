class Solution {
    public int maxProduct(int[] nums) {
      int ans=nums[0];
      int curmin=nums[0];
      int curmax=nums[0];
      for(int i=1;i<nums.length;i++){
        int temp=curmax*nums[i];
        curmax=Math.max(temp,Math.max(curmin*nums[i],nums[i]));
        curmin=Math.min(temp,Math.min(curmin*nums[i],nums[i]));
        ans=Math.max(curmax,ans);
      }  
      return ans;
    }
}