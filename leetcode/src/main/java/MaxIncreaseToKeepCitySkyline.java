public class MaxIncreaseToKeepCitySkyline {
//    public int maxIncreaseKeepingSkyline(int[][] grid) {
//        int n = grid.length;
//        int[] row = new int[n];
//        int[] col = new int[n];
//
//        for(int r = 0; r < n; r++) {
//            for(int c = 0; c < n; c++) {
//                row[r] = Math.max(row[r], grid[r][c]);
//                col[c] = Math.max(col[c], grid[r][c]);
//            }
//        }
//
//        int ans = 0;
//
//        for(int r = 0; r < n; r++) {
//            for(int c = 0; c < n; c++) {
//                ans += Math.min(row[r], col[c]) - grid[r][c];
//            }
//        }
//
//        return ans;
//    }




















    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // n == grid.length
        // n == grid[0].length
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];


        // 반복문 돌면서 행과 열의 최대값을 비교하며 값을 집어넣음
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                rowMax[r] = Math.max(grid[r][c], rowMax[r]);
                colMax[c] = Math.max(grid[r][c], colMax[c]);
            }
        }

        int sum = 0;

        // 동서남북의 스카이라인을 유지해야함.
        // 행과 열의 최댓값에서 작은 값을 해야 균형이 어긋나지 않고 증가 시킬 수 있으므로 최댓값 중에서의 최소값을 찾아주고,
        // 얼마만큼 차이가 나느냐의 문제이므로 원래의 값을 빼준 후 나온 값을 더한다.
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                sum += Math.min(rowMax[r], colMax[c]) - grid[r][c];
            }
        }

        return sum;
    }
}
