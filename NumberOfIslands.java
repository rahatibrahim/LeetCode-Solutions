import java.util.HashSet;

public class NumberOfIslands {
    HashSet<String> visited = new HashSet<>();

    public int numIslands(char[][] grid) {
        int island = 0;
        int nOfRow = grid.length + 2;
        int nOfCol = grid[0].length + 2;
        char[][] ocean = new char[nOfRow][nOfCol];

        for (int i = 0; i < nOfRow; i++) {
            for (int j = 0; j < nOfCol; j++) {
                if (i == 0
                        || j == 0
                        || i == nOfRow - 1
                        || j == nOfCol - 1) {
                    ocean[i][j] = '0';
                    System.out.print(0 + " ");
                } else {
                    ocean[i][j] = grid[i - 1][j - 1];
                    System.out.print(ocean[i][j] + " ");
                }
            }
            System.out.println();
        }

        for (int row = 1; row < nOfRow - 1; row++) {
            for (int col = 1; col < nOfCol - 1; col++) {
                String location = row + "," + col;
                String right = row + "," + (col + 1);
                String bot = (row + 1) + "," + col;

                if (ocean[row][col] == '1') {
                    if (!visited.contains(location) && !hasVisitedNeighbor(row, col, visited)) {
                        island++;
                        visited.add(location);
                    }

                    if (ocean[row][col + 1] == '1')
                        visited.add(right);
                    if (ocean[row + 1][col] == '1')
                        visited.add(bot);
                }
            }
        }

        return island;
    }

    public static boolean hasVisitedNeighbor(int row, int col, HashSet<String> visited) {
        String top = (row - 1) + "," + col;
        String bot = (row + 1) + "," + col;
        String right = row + "," + (col + 1);
        String left = row + "," + (col - 1);

        return visited.contains(top) || visited.contains(bot)
                || visited.contains(right) || visited.contains(left);
    }

    public static void main(String[] args) {
        NumberOfIslands obj = new NumberOfIslands();
        char[][] grid = {{'1','0','1','1','1'},{'1','0','1','0','1'},{'1','1','1','0','1'}};
        obj.numIslands(grid);
    }
}
