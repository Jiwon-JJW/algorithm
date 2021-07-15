package step3;

import java.io.*;
import java.util.StringTokenizer;

public class LessThenX10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int count = Integer.parseInt(stringTokenizer.nextToken());
        int value = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken());
            if (a < value) {
                bufferedWriter.write(a + " ");
            }
        }
        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
