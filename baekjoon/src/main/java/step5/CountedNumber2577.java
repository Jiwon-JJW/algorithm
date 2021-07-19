package step5;

import java.io.*;

public class CountedNumber2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine())
                * Integer.parseInt(bufferedReader.readLine())
                * Integer.parseInt(bufferedReader.readLine());

        int[] arr= new int[10];

        while (!(a <= 0)) {
            arr[a % 10]++;
            a /= 10;
        }

        for(int num : arr) {
            bufferedWriter.write(num + "\n");
        }

        bufferedWriter.flush();

    }
}

//효율은 더 떨어짐!!!
class Counted2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = String.valueOf(Integer.parseInt(bufferedReader.readLine())
                * Integer.parseInt(bufferedReader.readLine())
                * Integer.parseInt(bufferedReader.readLine()));

        bufferedWriter.write(countChar(a, '0') + "\n" +
                countChar(a, '1') + "\n" +
                countChar(a, '2') + "\n" +
                countChar(a, '3') + "\n" +
                countChar(a, '4') + "\n" +
                countChar(a, '5') + "\n" +
                countChar(a, '6') + "\n" +
                countChar(a, '7') + "\n" +
                countChar(a, '8') + "\n" +
                countChar(a, '9') + "\n");

        bufferedWriter.flush();
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}

