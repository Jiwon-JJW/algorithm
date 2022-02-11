import java.util.Scanner;

public class Sum1182 {
    static int n, s, count = 0;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        recFunc(0, 0);

        // count 합이 0이라면, 공집합도 포함되므로 제외하기위한 조건문
        System.out.println(s == 0 ? count - 1 : count );
    }

    static void recFunc(int dep, int sum) {
        if (dep == n) { // 마지막 도달 시, 원하는 값인지 체크하여 카운트
            if (sum == s) {
                count++;
            }
            return;
        }

        // 현재 위치의 원소를 선택하는지, 안하는지에 관한 부분수열 호출
        recFunc(dep + 1, sum + arr[dep]); // 원소 선택
        recFunc(dep + 1, sum); // 원소 선택 안함
    }
}
