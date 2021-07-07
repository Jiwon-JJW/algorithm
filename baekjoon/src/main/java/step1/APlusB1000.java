package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//12812KB	112ms
public class APlusB1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);

        scanner.close();
    }
}

//11488KB	84ms
class APlusB {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = bufferedReader.readLine().split(" ");
        int num = 0;
        for (String value : values) {
            num += Integer.parseInt(value);
        }

        System.out.println(num);
        bufferedReader.close();
    }
}

