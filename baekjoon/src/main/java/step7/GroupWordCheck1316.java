package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GroupWordCheck1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());
        int num = 0;

        while (count > 0) {
            count--;
            num++;
            String line = bufferedReader.readLine();
            List<String> arr = new ArrayList<>();

            for(int i = 0; i < line.length(); i++) {
                if(arr.contains(String.valueOf(line.charAt(i)))) {
                    if(!(arr.get(arr.size()-1).equalsIgnoreCase(String.valueOf(line.charAt(i))))) {
                        num -=1;
                        break;
                    };
                }

                if(!arr.contains(String.valueOf(line.charAt(i)))) {
                    arr.add(String.valueOf(line.charAt(i)));
                }

            }
        }

        System.out.println(num);
    }
}
