package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int range = 2;
        int layer = 0;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (n >= range) {
                range += 6 * layer++;
            }
            System.out.println(layer);
        }
    }
}
