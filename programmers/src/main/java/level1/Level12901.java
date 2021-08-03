package level1;

public class Level12901 {

  public static String solution(int a, int b) {
    String[] answer = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int totalDay = 0;

    for(int i = 1; i < a; i++) {
      totalDay += month[i-1];
    }

    totalDay += b-1;

    return answer[(totalDay)%7];
  }

  public static void main(String[] args) {

    System.out.println(solution(5, 24)+" | 예상 답: \"TUE\"");
    System.out.println(solution(1, 1)+" | 예상 답: \"FRI\"");
  }
}
