package level1;

import java.util.ArrayList;
import java.util.List;

public class Level42840 {
  public int[] solution(int[] array) {
    int[] score = new int[3];

    int[] student1 = {1,2,3,4,5};
    int[] student2 = {2,1,2,3,2,4,2,5};
    int[] student3 = {3,3,1,1,2,2,4,4,5,5};


    for(int i = 0; i < array.length; i++) {
      if(array[i] == student1[i%student1.length]) {
        score[0]++;
      }
      if(array[i] == student2[i%student2.length]) {
        score[1]++;
      }
      if(array[i] == student3[i%student3.length]) {
        score[2]++;
      }
    }

    List<Integer> winner = new ArrayList<>();
    int maxScore = Math.max(Math.max(score[0],score[1]),score[2]);

    if(maxScore == score[0]) winner.add(1);
    if(maxScore == score[1]) winner.add(2);
    if(maxScore == score[2]) winner.add(3);
    return winner.stream().mapToInt(i -> i).toArray();
  }
}
