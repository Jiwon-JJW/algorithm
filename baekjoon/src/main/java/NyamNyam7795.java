import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NyamNyam7795 {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        StringBuilder sb = new StringBuilder();

        int t = fr.nextInt();

        int[] a, b;

        for (int i = 0; i < t; i++) {
            int aLen = fr.nextInt();
            int bLen = fr.nextInt();

            a = new int[aLen];
            b = new int[bLen];

            for (int j = 0; j < aLen; j++) {
                a[j] = fr.nextInt();
            }

            for (int j = 0; j < bLen; j++) {
                b[j] = fr.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int count = 0;

            for (int j = 0; j < aLen; j++) {
                int idx = binarySearch(b, a[j]);
                count += idx;
            }

            sb.append(count + "\n");
        }

        System.out.println(sb);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        return start ;
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}
