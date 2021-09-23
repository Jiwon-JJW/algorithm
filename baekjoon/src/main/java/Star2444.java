import java.io.*;

public class Star2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < n; i++) {
            for(int k = n-1; k > i; k--) {
                bufferedWriter.write(" ");
            }

            for(int j = 0; j < 2*i+1; j++) {
                bufferedWriter.write("*");
            }

            bufferedWriter.write("\n");
        }

        for(int i = n-1; i > 0; i--) {
            for(int k = n-1; k >= i; k--) {
                bufferedWriter.write(" ");
            }

            for(int j = 2* i -1; j >0; j--) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
