package level1;

import java.util.ArrayList;
import java.util.List;

public class Level12921 {

  public static int solution(int n) {
    int answer = 0;
    for (int i = 2; i <= n; i++) {
      boolean isPrime = true;

      for (int j = 2; j<=Math.sqrt(i); j++) {
        if(i%j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) answer++;

    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println("나온 값: " + solution(10) + " | 기대 값: 4");
    System.out.println("나온 값: " + solution(5) + " | 기대 값: 3");
  }
}
