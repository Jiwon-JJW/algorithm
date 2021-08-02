package level1;

import java.util.Arrays;

public class Level12940 {
  public static int[] solution(int n, int m) {
    int gcd = gcd(n,m);
    return new int[] {gcd, (n*m / gcd)};
  }

  public static int gcd(int a, int b) {
    while (a > 0) {
      int temp = a;
      a = b % a;
      b = temp;
    }

    return b;
  }


  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(3,12)) + " | 예상 답: [3, 12]");
    System.out.println(Arrays.toString(solution(2,5)) + " | 예상 답: [1, 10]");
  }
}
