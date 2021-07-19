package step5;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MinMax10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer s = new StringTokenizer(bufferedReader.readLine());
        int min = 1_000_001;
        int max = -1_000_001;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s.nextToken());
            if (min > x) {
                min = x;
            }
            if (max < x) {
                max = x;
            }
        }

        bufferedWriter.write(min + " " + max);
        bufferedWriter.flush();
    }
}

class MM10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 1000000;
        int max = -1000000;
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
