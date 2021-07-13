package step3;

import java.io.*;

public class MultiplicationTable2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i < 10; i++) {
            bufferedWriter.write(num + " * " + i + " = " + (num * i) +"\n");
        }

        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
