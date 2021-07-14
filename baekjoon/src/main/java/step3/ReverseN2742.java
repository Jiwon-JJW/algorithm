package step3;

import java.io.*;

public class ReverseN2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = n; i > 0; i--) {
            bufferedWriter.write(i+"\n");
        }

        bufferedWriter.flush();
    }
}
