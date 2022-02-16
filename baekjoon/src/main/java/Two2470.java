import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Two2470 {
    static int a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        solution(n, arr);

        System.out.println(a + " " + b);
    }

    static void solution(int n, int[] arr) {
        int left = 0;
        int right = n - 1;
        int min = Integer.MAX_VALUE;

        int sum = 0;
        int temp = 0;

        while (left < right) {
            sum = arr[left] + arr[right];
            temp = Math.abs(sum);

            if(temp < min) {
                min = temp;
                a = arr[left];
                b = arr[right];
            }

            if(sum > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
}
