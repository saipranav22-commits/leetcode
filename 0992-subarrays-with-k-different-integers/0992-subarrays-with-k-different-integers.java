class Solution {
    public int slide(int nums[],int k){
        int st=0;
        int ans=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=nums[i];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.size()>k){
                int rem=nums[st];
                
                map.put(rem,map.getOrDefault(rem,0)-1);
                if(map.get(rem)==0){
                    map.remove(rem);
                }

                st++;
            }
            ans+=i-st+1;
        }
        return ans;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slide(nums,k)-slide(nums,k-1);
    }
}