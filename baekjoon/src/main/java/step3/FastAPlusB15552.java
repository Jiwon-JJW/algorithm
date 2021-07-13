package step3;

import java.io.*;
import java.util.StringTokenizer;

public class FastAPlusB15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++) {
           String[] num = bufferedReader.readLine().split(" ");
            bufferedWriter.write((Integer.parseInt(num[0]) + Integer.parseInt(num[1]))+"\n");
        }
        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

class FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(bufferedReader.readLine(), " ");
            bufferedWriter.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
