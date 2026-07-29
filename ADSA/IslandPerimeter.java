

public class IslandPerimeter  {

    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;

                    
                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2;
                    }
                
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        IslandPerimeter obj = new IslandPerimeter();

        int[][] grid = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };

        int result = obj.islandPerimeter(grid);
        System.out.println("Island Perimeter: " + result);
    }
}