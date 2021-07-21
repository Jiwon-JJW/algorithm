package step6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[10001];

        for (int i = 0; i < arr.length; i++) {
            int a = d(i);

            if (a < 10001) {
                arr[a] = true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                bufferedWriter.write(i + "\n");
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;

            n /= 10;
        }
        return sum;
    }
}
