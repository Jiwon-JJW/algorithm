import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr.add(1);
                } else {
                    int prev = answer.get(i - 1).get(j - 1);
                    int next = answer.get(i - 1).get(j);
                    arr.add(prev + next);
                }
            }
            answer.add(arr);
        }

        return answer;
    }
}
