package level1;

public class Level72410 {
  public static String solution(String new_id) {
    String answer = "";

    answer = new_id.replaceAll("[^-_.|\\w]","");

    answer = answer.replaceAll("[.]{2,}", ".");

    answer = answer.replaceAll("^[.]|[.]$", "");

    if(answer.length() == 0) {
      answer = "a";
    }

    if(answer.length() > 15) {
      answer = answer.substring(0,15);
      answer = answer.replaceAll("[.]$", "");
    }

    if(answer.length() <= 2) {
      while (answer.length() < 3) {
        answer += answer.charAt(answer.length()-1);
      }
    }

    return answer.toLowerCase();
  }

  public static void main(String[] args) {
    System.out.println(solution("...!@BaT#*..y.abcdefghijklm") + " | 예상 답안: \"bat.y.abcdefghi\"");
    System.out.println(solution("z-+.^.") + " | 예상 답안: \"z--\"");
    System.out.println(solution("=.=") + " | 예상 답안: \"aaa\"");
    System.out.println(solution("123_.def") + " | 예상 답안: \"123_.def\"");
    System.out.println(solution("abcdefghijklmn.p") + " | 예상 답안: \"abcdefghijklmn\"");
  }
}
