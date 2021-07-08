package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        System.out.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "1" : "0");
    }
}
