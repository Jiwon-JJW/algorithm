package level1;

public class Level12926 {

  public static String solution(String s, int n) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        answer.append(" ");
        continue;
      }

      char a = (char) (s.charAt(i) + n);

      if (s.charAt(i) > 64 && s.charAt(i) < 91) {
        if(a > 90) {
          answer.append((char)(a - 26));
          continue;
        }
      }

      if (a > 122) {
        answer.append((char) (a - 26));
        continue;
      }

      answer.append(a);
    }
    return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println(solution("AB", 1) + " 원하는 답 : \"BC\" ");
    System.out.println(solution("z", 1) + " 원하는 답 : \"a\" ");
    System.out.println(solution("a B z", 4) + " 원하는 답 : \"e F d\" ");
    System.out.println(solution("AaZz", 25) + " 원하는 답 : \"ZzYy\" ");
  }
}
