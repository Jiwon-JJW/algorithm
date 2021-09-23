import java.io.*;

public class Star2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i = n; i > 0; i--) {
            for(int k = n; k > i; k--) {
                bufferedWriter.write(" ");
            }
            for (int j = 2*i-1 ; j > 0; j--) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
