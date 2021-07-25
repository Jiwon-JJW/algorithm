package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int answer = 0;

        while (stringTokenizer.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder(stringTokenizer.nextToken());

            int i = Integer.parseInt(String.valueOf(sb.reverse()));

            if( i > answer ) {
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
