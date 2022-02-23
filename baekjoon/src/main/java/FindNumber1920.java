import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber1920 {
    static int n, m;
    static int[] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        a = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int result = solution(Integer.parseInt(st.nextToken()));

            if (result >= 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    static int solution(int token) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int tmp = a[mid];

            if (tmp > token) {
                high = mid - 1;
            } else if (tmp < token) {
                low = mid + 1;
            } else return mid;
        }
        return -1;
    }
}
