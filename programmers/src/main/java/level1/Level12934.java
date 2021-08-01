package level1;

public class Level12934 {

  public static long solution(long n) {
    Double a = Math.sqrt(n);

    if ( a == a.intValue()) {
     return (long)Math.pow(a+1, 2);
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solution(121) + " | 나와야 하는 답: 144");
    System.out.println(solution(3) + " | 나와야 하는 답: -1");

  }

}
