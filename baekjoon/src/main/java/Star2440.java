import java.io.*;

public class Star2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j >= i; j--) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
