package level1;

import java.util.Arrays;

public class level42576 {
    public String solution(String[] participant, String[] completion) {
      Arrays.sort(participant);
      Arrays.sort(completion);

      int index = 0;
      while (index < completion.length) {
        if(!(participant[index].equals(completion[index]))) {
          return participant[index];
        }
        index++;
      }
      return participant[index];
    }
}
