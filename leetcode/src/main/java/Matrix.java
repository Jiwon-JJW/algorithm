import java.util.LinkedList;
import java.util.Queue;

public class Matrix {
    int dir[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        int[][] dist = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    // 포문을 돌며 0일 경우 방문한 것으로 표시.
                    visited[i][j] = true;

                    //거리 체크 x
                    dist[i][j] = 0;

                    // 큐에 좌표 입력
                    q.add(new int[]{i, j});
                }
            }
        }

        // 큐의 크기만큼 반복문(인접한 0에 대해 최소 거리를 가져야하기 때문
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int i = temp[0];
            int j = temp[1];

            for (int k = 0; k < 4; k++) {
                int x = i + dir[k][0];
                int y = j + dir[k][1];
                if (x < m && x >= 0 && y < n && y >= 0) {
                    if (!visited[x][y]) {
                        dist[x][y] = dist[i][j] + 1;
                        q.add(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }

        }
        return dist;
    }
}
