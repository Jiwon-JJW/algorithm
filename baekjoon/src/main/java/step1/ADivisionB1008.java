package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ADivisionB1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        scanner.close();

        System.out.println(a / b);
    }
}

//11584KB	80ms
class ADivisionB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = bufferedReader.readLine().split(" ");

        bufferedReader.close();

        double a1 = Double.parseDouble(values[0]);
        double b1 = Double.parseDouble(values[1]);

        System.out.println(a1 / b1);
    }
}
