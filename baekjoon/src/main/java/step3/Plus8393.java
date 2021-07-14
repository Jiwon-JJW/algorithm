package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        int val = 0;

        for (int i = 1; i <=num; i++) {
            val += i;
        }

        System.out.println(val);
    }
}
