package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level42889 {

  public static int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    double[] stage = new double[N + 1];

    // stage에 머무르고 있는 사람의 수를 넣는다.
    for (int i : stages) {
      if (i == N + 1) {
        continue;
      }
      stage[i]++;
    }

    double totalPeople = stages.length;
    double tmp = 0;
    List<Double> copy = new ArrayList<>();
    // 실패율 계산
    for (int i = 1; i <= N; i++) {
      tmp = stage[i];

      if (totalPeople == 0) {
        stage[i] = 0;
      } else {
        stage[i] /= totalPeople;
          totalPeople -= tmp;
      }
      copy.add(stage[i]);
    }

    // 정렬해서 answer에 저장

    copy.sort(Collections.reverseOrder());

    for (int i = 0; i < copy.size(); i++) {
      for (int j = 1; j < stage.length; j++) {
        if (copy.get(i) == stage[j]) {
          answer[i] = j;
          stage[j] = -1.0;
          break;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}))
        + " | 예상 답안: [3, 4, 2, 1, 5]");
    System.out.println(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4}))
        + " | 예상 답안: [4, 1, 2, 3]");
  }
}
