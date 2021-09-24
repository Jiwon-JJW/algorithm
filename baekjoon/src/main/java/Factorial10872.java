import java.io.*;

public class Factorial10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        long nFactorial = 1;

        for(int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        bufferedWriter.write(String.valueOf(nFactorial));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
