class Solution {
    public int sumOfBeauties(int[] nums) {
        int n=nums.length;

        int pre[]=new int[n];
        int suf[]=new int[n];
        
        pre[0]=nums[0];
        suf[n-1]=nums[n-1];
        int ans=0;


        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }

        for(int i=n-2;i>=0;i--){
            suf[i]=Math.min(suf[i+1],nums[i]);
        }

        for(int i=1;i<n-1;i++){
            if(nums[i]>pre[i-1] && nums[i]<suf[i+1]){
                ans+=2;
            }
            else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                ans += 1;
            }
        }
        return ans;
    }
}