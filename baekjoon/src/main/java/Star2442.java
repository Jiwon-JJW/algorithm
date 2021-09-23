import java.io.*;

public class Star2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= n; i++) {
            for(int k = n-1; k >= i; k--) {
                bufferedWriter.write(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
