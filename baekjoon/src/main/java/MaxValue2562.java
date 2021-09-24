import java.io.*;

public class MaxValue2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            if(max < a) {
                max = a;
                index = i;
            }
        }
        bufferedReader.close();
        bufferedWriter.write(max + "\n" + index);

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
