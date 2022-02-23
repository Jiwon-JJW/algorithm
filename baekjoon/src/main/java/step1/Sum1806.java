package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum1806 {
    static int n, s;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        nums = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution());
    }

    static int solution() {
        int min = Integer.MAX_VALUE;
        int start = 0, end = 0, total = 0;

        while (start <= n && end <= n) {
            if(total >= s && min > end - start) {
                min = end - start;
            } else if(total < s) {
                total += nums[end++];
            } else total -= nums[start++];
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
