class Solution {
    public int jump(int[] nums) {
       int max=0;
       int n=nums.length;
       int count=0;
       int end=0;
       for(int i=0;i<nums.length-1;i++){
        max=Math.max(max,i+nums[i]);
        if(i==end){
        count++;
        end=max;
        }
        if(end>=n-1)return count;
       } 
       return count;
    }
}