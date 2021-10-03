import java.io.*;
import java.util.StringTokenizer;

public class Divisor1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int nCount = Integer.parseInt(bufferedReader.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        while (nCount -- > 0) {
            int N = Integer.parseInt(stringTokenizer.nextToken());
            max = N > max ? N : max;
            min = N < min ? N : min;
        }

        bufferedWriter.write(max * min + "");
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
