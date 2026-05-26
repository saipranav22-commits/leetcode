class Solution {
    public int longestOnes(int[] nums, int k) {
       int st=0;
       int max=0;
       int ans=0;
       int n=nums.length;
       
       HashMap<Integer,Integer>map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        int val=nums[i];
         map.put(val,map.getOrDefault(val,0)+1);

         if(val==1)
         max=Math.max(max,map.get(val));

         while((i-st+1)-max>k){
            int val1=nums[st];
            map.put(val1,map.getOrDefault(val1,0)-1);
            st++;
         }
         ans=Math.max(ans,i-st+1);
       }
       return ans; 
    }
}