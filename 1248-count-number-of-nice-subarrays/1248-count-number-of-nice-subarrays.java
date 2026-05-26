class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        int ans=0;
        int st=0;
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            int val=nums[i];
            if(val%2!=0){
                odd++;
                count=0;
            }
            while(odd==k){
                count++;
                if(nums[st]%2!=0){
                    odd--;
                }
                st++;
            }
            ans+=count;
        }
        return ans;
    }
}