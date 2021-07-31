package level1;

public class Level12922 {
    public String solution(int n) {
      StringBuffer answer = new StringBuffer();

      for (int i = 1; i <= n; i++) {
        if(i % 2 == 0) {
          answer.append("박");
        } else {
          answer.append("수");
        }
      }
      return answer.toString();
    }
}
