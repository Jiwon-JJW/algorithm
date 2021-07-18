package step4;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer;
        String string;

        while ((string= bufferedReader.readLine()) != null) {
            stringTokenizer = new StringTokenizer(string, " ");

            int a = Integer.parseInt(stringTokenizer.nextToken());

            int b = Integer.parseInt(stringTokenizer.nextToken());

            bufferedWriter.write(a + b + "\n");

            bufferedWriter.flush();
        }
    }
}
