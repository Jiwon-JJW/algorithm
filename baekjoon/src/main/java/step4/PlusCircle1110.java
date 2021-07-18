package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCircle1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int copy = n;
        int count = 0;

        do {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count ++;
        } while (copy != n);

        System.out.println(count);
    }
}
