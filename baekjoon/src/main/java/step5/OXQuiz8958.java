package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OXQuiz8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        int index = 0;

        while (index < num) {
            String[] arr = bufferedReader.readLine().split("");
            int totalScore = 0;
            int score = 1;

            for (String a : arr) {
                if(a.equals("X")) {
                    score = 1;
                    continue;
                }

                totalScore += score;
                score++;
            }

            System.out.println(totalScore);
            index++;
        }

    }

}
