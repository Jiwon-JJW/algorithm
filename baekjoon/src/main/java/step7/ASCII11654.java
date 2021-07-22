package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int ascii = bufferedReader.readLine().charAt(0);

        System.out.println(ascii);
    }
}
