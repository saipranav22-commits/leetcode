class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int curmin=nums[0];
        int curmax=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=curmax*nums[i];
            curmax=Math.max(temp,Math.max(curmin*nums[i],nums[i]));
            curmin=Math.min(temp,Math.min(curmin*nums[i],nums[i]));
            max=Math.max(curmax,max);
        }
        return max;
    }
}