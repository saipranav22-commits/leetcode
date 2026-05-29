class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer>map=new HashSet<>();
        int n=nums.length;
        int max=0;
        
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        for(int i:map){
            int val=i-1;
            if(!map.contains(val)){
            int count=1;
            while(map.contains(val+count)){
                count++;
            }
            max=Math.max(count-1,max);
            }
        }
       // System.out.print(map);

        return max;
    }
}