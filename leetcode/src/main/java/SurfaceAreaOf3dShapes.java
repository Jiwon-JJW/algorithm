public class SurfaceAreaOf3dShapes {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    // 한 육면체의 표면 사이즈 = 6 * grid[i][j]
                    // 수직으로 큐브가 배치되었다고 생각했을 때 공통으로 제거될 표면 사이즈 = 2 * (grid[i][j] - 1)
                    total += 6 * grid[i][j] - 2 * (grid[i][j] - 1);
                }

                // 수직으로 겹치는 부분 제거
                // 더 작은 부분이 겹치는 부분이기 때문에... 
                if (i > 0) {
                    total -= 2 * Math.min(grid[i - 1][j], grid[i][j]);
                }

                // 수평으로 겹치는 부분 제거
                if (j > 0) {
                    total -= 2 * Math.min(grid[i][j - 1], grid[i][j]);
                }
            }
        }

        return total;
    }
}
