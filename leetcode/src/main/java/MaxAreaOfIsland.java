public class MaxAreaOfIsland {
//    int x, y;
//
//    public int maxAreaOfIsland(int[][] grid) {
//        x = grid.length;
//        y = grid[0].length;
//
//        int max = 0;
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                if (grid[i][j] == 1) {
//                    int area = dfs(grid, i, j, 0);
//                    max = Math.max(area, max);
//                }
//            }
//        }
//
//        return max;
//    }
//
//    public int dfs(int[][] grid, int i, int j, int area) {
//        if (i < 0 || j < 0 || i >= x || j >= y ||
//                grid[i][j] == 0) return area;
//
//        area++;
//
//        grid[i][j] = 0;
//        area = dfs(grid, i - 1, j, area);
//        area = dfs(grid, i + 1, j, area);
//        area = dfs(grid, i, j - 1, area);
//        area = dfs(grid, i, j + 1, area);
//
//        return area;
//    }


    int[][] grid;
    int x; int y;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        x = grid.length;
        y = grid[0].length;

        int max =0;

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(i,j,0);
                    max = Math.max(area , max);
                }
            }
        }

        return max;
    }

    private int dfs(int i, int j, int area) {
        if(i < 0 || j < 0 || i >= x || j >= y || grid[i][j] == 0) {
            return area;
        }
        area++;
        grid[i][j] = 0;

        area = dfs(i + 1, j, area);
        area = dfs(i - 1, j, area);
        area = dfs(i, j + 1, area);
        area = dfs(i, j - 1, area);

        return area;
    }


}
