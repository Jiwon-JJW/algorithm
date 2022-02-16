import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TreeCut2805 {
    static int n, m, max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());

            if (max < trees[i]) {
                max = trees[i];
            }
        }

        System.out.println(solution(trees));
    }

    static long solution(int[] trees) {
        long start = 0;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                    //tree의 잘린 길이 = tree의 높이 - 자르는 위치(mid)
                    //tree의 잘린 길의의 합을 구한다
                }
            }

            if (sum >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}
