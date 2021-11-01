import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int ans = 0;
        Queue<int[]> queue = new LinkedList<>();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 썩은 오렌지를 체크해서 큐에 저장한 후, 방문 했다는 것을 남기기 위해 0으로 만든다
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                    grid[i][j] = 0;

                    // 신선한 오렌지의 개수를 센다
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // 큐의 사이즈만큼 반복한다
        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] temp = queue.poll();
                int i = temp[0];
                int j = temp[1];

                // 4면에서 닿는 신선한 오렌지들을 썩게 만든 후 큐에 저장한다.
                if (i + 1 < m && grid[i + 1][j] == 1) {
                    queue.add(new int[]{i + 1, j});
                    grid[i + 1][j] = 0;
                    fresh--;
                }
                if (j + 1 < n && grid[i][j + 1] == 1) {
                    queue.add(new int[]{i, j + 1});
                    grid[i][j + 1] = 0;
                    fresh--;
                }
                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    queue.add(new int[]{i - 1, j});
                    grid[i - 1][j] = 0;
                    fresh--;
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    queue.add(new int[]{i, j - 1});
                    grid[i][j - 1] = 0;
                    fresh--;
                }
            }

            // 사면의 맞닿은 오렌지를 썩게한 후 카운트
            if(queue.size() > 0) {
                ans++;
            }
        }
        // 4 방향에 맞닿아있는 오렌지가 없어서 썩게 하지 못했다면 - 1 반환
        if(fresh > 0) {
            return -1;
        }
        return ans;
    }
}
