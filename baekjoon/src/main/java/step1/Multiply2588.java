package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//12800KB	120ms
public class Multiply2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long b2 = b;

        while (b2 > 0) {
            System.out.println(a*(b2%10));
            b2 /= 10;
        }

        System.out.println(a*b);
    }
}

//	11420KB	84ms
class Multiply {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(bufferedReader.readLine());
        long b = Long.parseLong(bufferedReader.readLine());
        long b2 = b;

        while (b2 > 0) {
            System.out.println(a*(b2%10));
            b2 /= 10;
        }

        System.out.println(a*b);
    }
}
