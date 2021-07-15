package step3;

import java.io.*;

public class Star2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++) {
            for(int k = count-1 ; k > i; k--) {
                bufferedWriter.write(" ");
            }
            for (int j = 0; j <= i ; j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
