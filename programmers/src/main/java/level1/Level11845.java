package level1;

import java.util.HashSet;
import java.util.Set;

public class Level11845 {
    public int solution(int[] nums) {
        int answer = nums.length / 2;

        // 중복 포켓몬 제거를 위한 Set
        Set<Integer> newNum = new HashSet<>();

        for(int i : nums) {
            newNum.add(i);
        }


        // answer보다 포켓몬의 수가 많을 경우, 최대 경우의 수는 answer가 된다.
        if(answer < newNum.size()) {
            return answer;
        } else {

            // answer보다 포켓몬의 수가 적을 경우, 최대 경우의 수는 newNum의 크기가 된다.
            return newNum.size();
        }
    }
}
