package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrant14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.println(a > 0 && b > 0 ? "1"
                : a < 0 && b > 0 ? "2"
                : a < 0 && b < 0 ? "3"
                : "4"
        );
    }
}
