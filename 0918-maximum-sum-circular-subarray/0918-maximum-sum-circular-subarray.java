class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int curmin=nums[0];
       int curmax=nums[0];
       int max=nums[0];
       int min=nums[0];
       int total=nums[0];
       for(int i=1;i<nums.length;i++){
         total += nums[i];
        curmax=Math.max(curmax+nums[i],nums[i]);
        curmin=Math.min(curmin+nums[i],nums[i]);
        max=Math.max(max,curmax);
        min=Math.min(min,curmin);
       } 
       if(max<0){
        return max;
       }
       return Math.max(max,total-min);
    }
}