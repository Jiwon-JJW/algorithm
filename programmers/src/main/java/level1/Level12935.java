package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level12935 {
  public static int[] solution(int[] arr) {
    if (arr.length == 1) {
      return new int[] {-1};
    }

    List<Integer> answer = new ArrayList<>();
    int min = 100000000;

    for(int i : arr){
      if (min > i) min = i;
    }

    for (int i = 0; i < arr.length; i++) {
      if (min < arr[i]) answer.add(arr[i]);
    }

    return answer.stream().mapToInt(i -> i.intValue()).toArray();
  }

  public static int[] solution2(int[] arr) {
    if (arr.length <= 1) {
      return new int[] {-1};
    }

    int min = Arrays.stream(arr).min().getAsInt();

    return Arrays.stream(arr).filter(i -> i != min).toArray();
  }

  public static void main(String[] args) {
    System.out.println("솔루션 1");
    System.out.println(Arrays.toString(solution(new int[] {4,3,2,1})) + " | 결과 값: [4,3,2]");
    System.out.println(Arrays.toString(solution(new int[] {10}))+ " | 결과 값: [-1]");

    System.out.println("솔루션 2");
    System.out.println(Arrays.toString(solution(new int[] {4,3,2,1}))+ " | 결과 값: [4,3,2]");
    System.out.println(Arrays.toString(solution(new int[] {10}))+ " | 결과 값: [-1]");
  }
}
