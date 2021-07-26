package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatianAlphabet2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        int count = 0;

        if (line.contains("c=")) {
            line = line.replaceAll("c=", " ");
        }
        if (line.contains("c-")) {
            line = line.replaceAll("c-", " ");
        }
        if (line.contains("dz=")) {
            line = line.replaceAll("dz=", " ");
        }
        if (line.contains("d-")) {
            line = line.replaceAll("d-", " ");
        }
        if (line.contains("lj")) {
            line = line.replaceAll("lj", " ");
        }
        if (line.contains("nj")) {
            line = line.replaceAll("nj", " ");
        }
        if (line.contains("s=")) {
            line = line.replaceAll("s=", " ");
        }
        if (line.contains("z=")) {
            line = line.replaceAll("z=", " ");
        }
        System.out.println(line.length());

    }
}
