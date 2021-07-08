package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmClock2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] times = bufferedReader.readLine().split(" ");

        bufferedReader.close();

        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);

        if (minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
            return;
        }

        minute -= 45;
        System.out.println(hour + " " + minute);
    }
}
