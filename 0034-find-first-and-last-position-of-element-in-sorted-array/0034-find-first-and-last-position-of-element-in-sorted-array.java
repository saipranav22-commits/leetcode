class Solution {

    public static int bs(int low,int high,int target,boolean side,int []nums){
        int ind=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
               high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                ind=mid;
                if(side){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return ind;
    }
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int res[]=new int[2];
        int left=bs(low,high,target,true,nums);
        int right=bs(low,high,target,false,nums);
        res[0]=left;
        res[1]=right;
        return res;
    }
}