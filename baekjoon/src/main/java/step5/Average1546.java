package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        double max = -1000000;
        double sum = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < num; i ++) {
            double a = Integer.parseInt(stringTokenizer.nextToken());
            if( max < a) {
                max = a;
            }
            sum += a;
        }

        System.out.println(sum/max*100/num);
    }
}
