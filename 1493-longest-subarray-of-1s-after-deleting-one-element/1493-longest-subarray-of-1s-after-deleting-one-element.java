class Solution {
    public int longestSubarray(int[] nums) {
        int st=0;
        int max=0;
        int most=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          if(nums[i]==1){
            most=Math.max(map.get(nums[i]),most);
          }
          while((i-st+1)-most>1){
            map.put(nums[st],map.getOrDefault(nums[st],0)-1);
            st++;
          } 
          max=Math.max(i-st,max);
        }
        return max;
    }
}