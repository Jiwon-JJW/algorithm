package level1;

public class test {
  public static int solution(int n) { // n을 받으면 n 이하의 소수의 개수를 구해 반환한다.
    int answer = 0;
    for (int i = 1; i <= n; i++) {
      if(!isPrime(i)) answer++;

    }
    return answer;
  }

  static boolean isPrime(int n) {
    if( n <= 1 )
      return false; //1은 소수가 아님.

    // 짝수는 소수에서 제외
    // 단, 2는 유일하게 짝수 중에서 소수
    if( n%2 == 0)
      return n==2;

    // n이 홀수인 경우 sqrt(n)까지 나눠서 나눠떨어지는지 여부 체크
    for(int i=3; i<=Math.sqrt(n); i += 2) {  // 짝수는 소수가 아니므로...
      // 나눠 떨어진다면 약수에 해당하므로 소수가 아님.
      if( n % i == 0)
        return false;
    }
    // 위에서 걸러지지 않은 나머지 경우는 소수에 해당됨
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solution(2));
    System.out.println(solution(5));
    System.out.println(solution(10));
    System.out.println(solution(15));
  }

}
