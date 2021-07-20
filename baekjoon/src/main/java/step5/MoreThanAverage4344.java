package step5;

import java.io.*;
import java.util.StringTokenizer;

public class MoreThanAverage4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        int index = 0;

        StringTokenizer stringTokenizer;

        while (index < count) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int studentNum = 0;
            int totalStudent = Integer.parseInt(stringTokenizer.nextToken());
            int[] arr = new int[totalStudent];

            double average = 0;
            for (int i = 0; i < totalStudent; i++) {
                arr[i] = Integer.parseInt(stringTokenizer.nextToken());
                average += arr[i];
            }
            average /= totalStudent;

            for (int i : arr) {
                if (average < i) {
                    studentNum++;
                }
            }

            System.out.printf("%.3f", studentNum * 100.0 / totalStudent);
            System.out.println("%");
            index++;
        }
    }
}
