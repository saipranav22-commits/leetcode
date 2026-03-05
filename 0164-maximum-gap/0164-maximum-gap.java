import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.offer(num);
        }

        int maxDiff = 0;
        while (!maxHeap.isEmpty()) {
            int top = maxHeap.poll();
            if (maxHeap.isEmpty()) break;
            int next = maxHeap.peek();
            maxDiff = Math.max(maxDiff, top - next);
        }

        return maxDiff;
    }
}