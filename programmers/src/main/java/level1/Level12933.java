package level1;

import java.util.Arrays;
import java.util.Collections;

public class Level12933 {

  public static long solution(long n) {
    String[] val = String.valueOf(n).split("");

    Integer[] arr = Arrays.stream(val).mapToInt(Integer::parseInt)
        .boxed().toArray(Integer[]::new);
    Arrays.sort(arr, Collections.reverseOrder());

    long answer = 0;

    for (int i : arr) {
      answer = (answer * 10) + i;
    }

    return answer;
  }

  public static long solution2(long n) {
    String[] list = String.valueOf(n).split("");
    Arrays.sort(list);

    StringBuilder sb = new StringBuilder();
    for (String aList : list) {
      sb.append(aList);
    }

    return Long.parseLong(sb.reverse().toString());
  }

  public static void main(String[] args) {
    System.out.println(solution(1183772) + " | 결과 값: 873211");
    System.out.println(solution2(1183772) + " | 결과 값: 873211");
  }

}
