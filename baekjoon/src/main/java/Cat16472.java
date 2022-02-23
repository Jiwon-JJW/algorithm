import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cat16472 {
    static int n;
    static String[] arr;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split("");

        System.out.println(solution());
    }

    static int solution() {
        int start = 0;
        int end = 0;
        int max = 0;
        int preS = start;

        while (start <= end && end < arr.length) {
            if ((start != end || end == 0) && preS == start)
                map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);


            if (map.size() <= n) {
                max = Math.max(max, end - start + 1);
                end++;
                preS = start;
            } else {
                int num = map.get(arr[start]) - 1;
                if (num == 0)
                    map.remove(arr[start]);
                else
                    map.put(arr[start], num);
                start++;
            }
        }

        return max;
    }

}
