class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);

        long ans = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (map.get(nums[i]) > map.get(nums[i + 1])) {
                ans += n - i;
            } else {
                ans += 1;
            }
        }
        return ans;
    }
}