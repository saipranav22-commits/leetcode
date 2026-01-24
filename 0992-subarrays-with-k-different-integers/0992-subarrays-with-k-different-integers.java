class Solution {
    static int ans(int nums[],int k){
                HashMap<Integer,Integer>map=new HashMap<>();
        int res=0;
        int st=0;
        for(int i=0;i<nums.length;i++){
            int add=nums[i];
            map.put(add,map.getOrDefault(add,0)+1);
            while(map.size()>k){
                int rem=nums[st];
                map.put(rem,map.getOrDefault(rem,0)-1);
                if(map.get(rem)==0){
                map.remove(rem);
                }
                st++;
            }
        res+=i-st+1;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return ans(nums,k)-ans(nums,k-1);
    }
}