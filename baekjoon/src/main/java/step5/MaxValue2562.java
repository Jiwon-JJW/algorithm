package step5;

import java.io.*;

public class MaxValue2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());

            if (max < a) {
                max = a;
                index = i+1;
            }
        }

        bw.write(max + "\n" + index);
        bw.flush();

    }
}
