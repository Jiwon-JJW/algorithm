package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ListOfUniqueNumbers {
    static int n;
    static int[] a;
    static int[] possible;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        a = new int[n + 1];
        possible = new int[100000 + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution());
    }

    static long solution() {

        int low = 1;
        int high = 0;
        long count = 0;

        while(low <= n) {
            while (high + 1 <= n && possible[a[high + 1]] == 0) {
                high++;
                possible[a[high]]++;
            }

            count += high - low + 1;

            possible[a[low++]]--;
        }

        return count;
    }
}
