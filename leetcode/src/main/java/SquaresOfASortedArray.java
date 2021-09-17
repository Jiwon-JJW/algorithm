import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num < 0) {
                num *= -1;
            }

            answer[i] = num * num;
        }
        Arrays.sort(answer);
        return answer;
    }


    public int[] sortedSquares2(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for(int i : nums) {
            if(i < 0) {
                i *= -1;
            }

            answer.add(i * i);
        }

        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
