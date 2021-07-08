package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTwoNumbers1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = bufferedReader.readLine().split(" ");

        bufferedReader.close();

        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);

        System.out.println(a > b ? ">" : a < b ? "<" : "==");
    }
}
