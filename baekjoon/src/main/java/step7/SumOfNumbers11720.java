package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfNumbers11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;

        String line = bufferedReader.readLine();

        for (int i = 0; i < count; i++) {
            sum += line.charAt(i) - '0';
        }
        System.out.println(sum);

    }
}
