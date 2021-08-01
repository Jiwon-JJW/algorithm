package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level12932 {
  public static int[] solution(long n) {
    List<Integer> answer = new ArrayList<>();

    while (n > 0) {
      answer.add((int) (n%10));
      n = n / 10;
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(12345)) + " | 결과 값: [5,4,3,2,1]");
  }
}
