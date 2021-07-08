package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestScore9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        System.out.println(score > 89 && score <= 100 ? "A"
                : score > 79 && score < 90 ? "B"
                : score > 69 && score < 80 ? "C"
                : score > 59 && score < 70 ? "D"
                : "F");
    }
}
