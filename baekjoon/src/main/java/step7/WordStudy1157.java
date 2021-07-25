package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class WordStudy1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine().toUpperCase(Locale.ROOT);
        char answer = '?';

        int max = -1;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 65;
            arr[index]++;

            if (max < arr[index]) {
                max = arr[index];
                answer = s.charAt(i);
            } else if (max == arr[index]) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
