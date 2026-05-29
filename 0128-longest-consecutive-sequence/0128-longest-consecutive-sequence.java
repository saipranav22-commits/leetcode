class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            map.add(nums[i]);
        }

        for (int i : map) {
            if (!map.contains(i - 1)) {   
                int count = 1;

                while (map.contains(i + count)) {
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}