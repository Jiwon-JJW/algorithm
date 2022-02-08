import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class File20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>(); // 자동 정렬 되는 맵

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split("\\.");

            //찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환됩니다.
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }

        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
