package step3;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;

        for (int i = 1; i <= count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }

        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
