package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());

        System.out.println(count(num));
    }

    public static int count(int num) {
        if (num < 100) {
            return num;
        }

        int count = 99;
        for (int i = 100; i <= num; i++) {
            if (i / 100 - (i / 10) % 10 == (i / 10) % 10 - i % 10) {
                count++;
            }
        }
        return count;
    }
}
