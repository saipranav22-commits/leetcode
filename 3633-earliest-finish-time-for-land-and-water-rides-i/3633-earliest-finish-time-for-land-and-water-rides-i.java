class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {

                int land = Math.max(landStartTime[i], 0) + landDuration[i];
                int A = Math.max(land, waterStartTime[j]) + waterDuration[j];

                int water = Math.max(waterStartTime[j], 0) + waterDuration[j];
                int B = Math.max(water, landStartTime[i]) + landDuration[i];

                min = Math.min(min, Math.min(A, B));
            }
        }
        return min;
    }
}