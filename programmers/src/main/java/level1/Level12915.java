package level1;

import java.util.Arrays;
import java.util.Comparator;

public class Level12915 {
  public static String[] solution(String[] strings, int n) {
    Arrays.sort(strings);
    Arrays.sort(strings, Comparator.comparing((String s) -> s.substring(n, n+1)));
    return strings;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1))
    + " | 예상 답: [\"car\", \"bed\", \"sun\"]");
    System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 1))
        + " | 예상 답: [\"abcd\", \"abce\", \"cdx\"]");

  }
}
