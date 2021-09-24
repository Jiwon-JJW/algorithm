import java.io.*;

public class CaesarCipher5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - 3 < 65) {
                answer.append((char) (s.charAt(i) + 23));
            } else {
                answer.append((char) (s.charAt(i) - 3));
            }
        }

        bufferedWriter.write(answer.toString());
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
