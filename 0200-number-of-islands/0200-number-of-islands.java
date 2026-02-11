class Solution {

    static int row;
    static int col;
    static char[][] arr;

    static void recursion(int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || arr[i][j] == '0')
            return;

        arr[i][j] = '0';

        recursion(i + 1, j);
        recursion(i - 1, j);
        recursion(i, j + 1);
        recursion(i, j - 1);
    }

    public int numIslands(char[][] grid) {

        // if (grid == null || grid.length == 0)
        //     return 0;

        arr = grid;
        row = grid.length;
        col = grid[0].length;

        int c = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == '1') {
                    c++;
                    recursion(i, j);
                }
            }
        }
        return c;
    }
}