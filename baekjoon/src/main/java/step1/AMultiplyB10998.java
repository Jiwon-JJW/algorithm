package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//	12820KB	112ms
public class AMultiplyB10998 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a*b);

        scanner.close();
    }
}

// 11472KB	80ms
class AMultiplyB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = bufferedReader.readLine().split(" ");
        int num = 1;

        for (String value : values) {
            num *= Integer.parseInt(value);
        }

        System.out.println(num);
    bufferedReader.close();
    }
}
