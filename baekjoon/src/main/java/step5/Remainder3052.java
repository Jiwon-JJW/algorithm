package step5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Remainder3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> value = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int a = Integer.parseInt(bufferedReader.readLine()) % 42;

            if(!(value.contains(a))) {
                value.add(a);
            }
        }

        System.out.println(value.size());
    }
}
