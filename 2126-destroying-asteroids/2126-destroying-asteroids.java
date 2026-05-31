class Solution {
    public boolean asteroidsDestroyed(int mass, int[] nums) {
        Arrays.sort(nums);

        long sum=mass;
        for(int i=0;i<nums.length;i++){
            if(sum>=nums[i]){
                sum+=nums[i];
            }else{
                return false;
            }
        }
        return true;
    }
}