package level1;

public class Level77884 {

  public static int solution(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++) {
      if (countDivisor(i) % 2 != 0) {
        answer -= i;
      } else {
        answer += i;
      }
    }
    return answer;
  }

  public static int solution2(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++) {
      int count = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          count++;
        }
      }

      if (count % 2 == 0) {
        answer += i;
      } else {
        answer -= i;
      }
    }
    return answer;
  }

  public static int countDivisor(int num) {
    int count = 0;
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        if (num / i == i) {
          count++;
        } else {
          count += 2;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solution(13, 17) + " | 원래 답: 43");
    System.out.println(solution(24, 27) + " | 원래 답: 52");
  }
}
