class Solution {
    public int longestOnes(int[] nums, int k) {
      HashMap<Integer,Integer>map=new HashMap<>();
      int st=0;
      int res=0;
      int max=0;
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       if(nums[i]==1)
       max=Math.max(max,map.get(nums[i]));
       while((i-st+1)-max>k){
        map.put(nums[st],map.getOrDefault(nums[st],0)-1);
        st++;
       }
       res=Math.max(res,i-st+1);
      }
      return res;  
    }
}