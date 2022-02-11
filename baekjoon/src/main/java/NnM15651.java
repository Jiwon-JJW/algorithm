import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NnM15651 {
    static StringBuilder sb = new StringBuilder();

    static int n, m;
    static int[] selected;

    static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m + 1];
    }

    static void recFunc(int k) {
        if(k == m + 1) { // 다 골랐을 경우
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for(int i = 1; i <= n; i++) {
                selected[k] = i;

                // k+1 번 부터 m번까지 잘 채워주는 함수 호출
                recFunc(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        init();

        recFunc(1);
        System.out.println(sb.toString());
    }
}
