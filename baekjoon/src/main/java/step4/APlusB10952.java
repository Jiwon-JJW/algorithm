package step4;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer;

        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());

            int b = Integer.parseInt(stringTokenizer.nextToken());

            bufferedWriter.write(a + b + "\n");

            if (a == 0 && b == 0) {
                break;
            }
                bufferedWriter.flush();
        }


    }
}
