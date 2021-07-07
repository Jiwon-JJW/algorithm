package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//12876KB	112ms
public class AMinusB1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a-b);
        scanner.close();
    }
}

//11480KB	84ms
class AMinusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] values = bufferedReader.readLine().split(" ");
        int num = 0;
        for(String value : values) {
            if (num > 0){
                num -= Integer.parseInt(value);
            }else {
                num += Integer.parseInt(value);
            }
        }

        System.out.println(num);
        bufferedReader.close();
    }
}
