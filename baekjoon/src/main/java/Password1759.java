import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Password1759 {
    static char[] arr;
    static int[] selected;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        arr = new char[m];
        selected = new int[m];

        str = bufferedReader.readLine().split(" ");

        for(int i = 0; i < m; i++) {
            arr[i] = str[i].charAt(0);
        }

        Arrays.sort(arr);
        recFunc(0, 0, 0, 0);
    }

    static void recFunc(int start, int dep, int consonant, int vowel) {
        for(int i = start; i < m; i++) {
            selected[i] = 1; // 선택한 문자 확인
            // 자음 모음 갯수 파악 후 다음 재귀
            recFunc(i + 1, dep + 1, consonant + (!check(arr[i]) ? 1 : 0),
                    vowel + (check(arr[i]) ? 1 : 0));

            selected[i] = 0;
        }

        //문자 개수가 n, 자음과 모음의 개수가 각각 2개 이상, 1개 이상일 때 프린트
        if(dep == n && consonant >= 2 && vowel >= 1) {
            for(int i = 0; i < m; i++) {
                // 0일경우 선택되지 않음.
                if(selected[i] == 1) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }

    // 자음 모음 파악 함수
    static boolean check(char a) {
            return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }
}
