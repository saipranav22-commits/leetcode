class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int ans=0;
        int n=nums.length;

        HashMap<Integer,Integer>map=new HashMap<>();
        int pre[]=new int[n+1];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }

        map.put(0,1);

        for(int i=0;i<n;i++){
            int tar=pre[i]-goal;

            if(map.containsKey(tar)){
                ans+=map.get(tar);
            }

            map.put(pre[i],map.getOrDefault(pre[i],0)+1);

        }
        
       return ans;
    }
}