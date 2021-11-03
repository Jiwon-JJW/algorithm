public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] row = new int[n];
        int[] col = new int[n];

        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                row[r] = Math.max(row[r], grid[r][c]);
                col[c] = Math.max(col[c], grid[r][c]);
            }
        }

        int ans = 0;

        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                ans += Math.min(row[r], col[c]) - grid[r][c];
            }
        }

        return ans;
    }
}
