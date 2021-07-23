package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRepeat2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());

        while (num > 0) {
            int count = bufferedReader.read() - '0';
            String line = bufferedReader.readLine().trim();

            for (int i = 0; i < line.length(); i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(line.charAt(i));
                }
            }
            System.out.println();
            num--;
        }
    }
}
