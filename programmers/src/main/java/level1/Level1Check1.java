package level1;

public class Level1Check1 {
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            if(a < b) {
                for (int i = a; i <= b; i++) {
                    answer += i;
                }
                return answer;
            }
            if(a > b) {
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
                return answer;
            }
            if(a == b) {
                return a;
            }
            return answer;
        }
    }
}
