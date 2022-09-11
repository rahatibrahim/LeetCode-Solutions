public class NumberOfIslands {
    int count = 0;

    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j, char[][] grid) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1)
            return;

        if (grid[i][j] == '1') {
            grid[i][j] = '#';
            dfs(i, j - 1, grid);
            dfs(i, j + 1, grid);
            dfs(i + 1, j, grid);
            dfs(i - 1, j, grid);
        }
    }

    public static void main(String[] args) {
        NumberOfIslands obj = new NumberOfIslands();
        char[][] grid = { { '1', '0', '1', '1', '1' },
                { '1', '0', '1', '0', '1' },
                { '1', '1', '1', '0', '1' } };
        System.out.println(obj.numIslands(grid));
    }
}
