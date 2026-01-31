class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return findMin(m - 1, n - 1, grid, dp);
    }

    public int findMin(int x, int y, int[][] grid, int[][] dp) {
        if (x < 0 || y < 0)
            return Integer.MAX_VALUE;

        if (x == 0 && y == 0)
            return grid[0][0];

        if (dp[x][y] != -1)
            return dp[x][y];

        return dp[x][y] =
                grid[x][y] +
                Math.min(
                    findMin(x - 1, y, grid, dp),
                    findMin(x, y - 1, grid, dp)
                );
    }
}