class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                total += grid[i][j];
            }
        }

        if (total % 2 != 0) return false;

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < m; j++) {
                sum += grid[i][j];
            }

            ans += sum; 

            if (ans == total - ans) {
                return true;
            }
        }

        ans = 0;

        for (int i = 0; i < m; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += grid[j][i];
            }

            ans += sum; 

            if (ans == total - ans) {
                return true;
            }
        }

        return false;
    }
}