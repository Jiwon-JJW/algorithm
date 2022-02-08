import java.util.Scanner;

public class Num14888 {
    static int max = Integer.MIN_VALUE
            , min = Integer.MAX_VALUE
            , n;

    static int[] operator = new int[4];
    static int[] number;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        number = new int[n];

        for(int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for(int i = 0; i < operator.length; i++) {
            operator[i] = sc.nextInt();
        }

        recFunc(number[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    static void recFunc(int num, int idx) {
        // 인덱스가 n의 갯수와 같다면 연산자를 모두 사용한 것이니 최소,최대값 비교.
        if(idx == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i = 0; i < 4; i++) {
            // 연산자 갯수가 1개 이상일 경우
            if(operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0 : recFunc(num + number[idx], idx + 1); break;
                    case 1 : recFunc(num - number[idx], idx + 1); break;
                    case 2 : recFunc(num * number[idx], idx + 1); break;
                    case 3 : recFunc(num / number[idx], idx + 1); break;
                }

                operator[i]++;
            }
        }
    }
}
