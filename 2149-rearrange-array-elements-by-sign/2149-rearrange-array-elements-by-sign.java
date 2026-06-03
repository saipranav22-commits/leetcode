class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

       int pos[]=new int[n/2];
       int neg[]=new int[n/2];
       int res[]=new int[n];
       int posind=0;
       int negind=0;

       for(int i=0;i<n;i++){
        if(nums[i]>=0){
           pos[posind++]=nums[i];
        }else{
            neg[negind++]=nums[i];
        }
       }
       int ind=0;
       for(int i=0;i<n/2;i++){
          res[ind++]=pos[i];
          res[ind++]=neg[i];
       }
       return res;
    }
}