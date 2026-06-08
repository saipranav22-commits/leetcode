class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();
      List<Integer>res=new ArrayList<>();
      int n=nums.length;

      for(int i=0;i<n;i++){
        int val=nums[i];
        map.put(val,map.getOrDefault(val,0)+1);
        if(map.get(val)>n/3 && !res.contains(val)){
            res.add(val);
        }
      }
      return res; 
    }
}