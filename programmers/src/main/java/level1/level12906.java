package level1;

import java.util.ArrayList;
import java.util.List;

public class level12906 {
    public Integer[] solution(int []arr) {

      List<Integer> list = new ArrayList<>();
      list.add(arr[0]);

      for(int i = 1; i< arr.length; i++) {
        if(arr[i] != arr[i-1]) {
          list.add(arr[i]);
        }
      }

      return list.toArray(new Integer[list.size()]);
    }
}
