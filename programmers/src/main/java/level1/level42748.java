package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class level42748 {
  public static void main(String[] args) {
    int[] arr = {1, 5, 2, 6, 3, 7, 4};
    int[][] cmd = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};


    System.out.println(Arrays.toString(solution(arr, cmd)));
  }
  static public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      List<Integer> arr = new ArrayList<>();
      for (int j = commands[i][0]; j <= commands[i][1]; j++) {
        arr.add(array[j-1]);
      }

      Collections.sort(arr);
      answer[i] = arr.get(commands[i][2]-1);
    }

    return answer;
  }
}
