class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        Map<Long, Long> map = new HashMap<>();
        
        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int num : nums) {

            long curr = num;

            if (map.containsKey(curr - k)) {
                ans = Math.max(ans,
                        prefix + curr - map.get(curr - k));
            }

            if (map.containsKey(curr + k)) {
                ans = Math.max(ans,
                        prefix + curr - map.get(curr + k));
            }

            map.put(curr,
                    Math.min(map.getOrDefault(curr, Long.MAX_VALUE),
                             prefix));

            prefix += curr;
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}