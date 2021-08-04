package level1;

import java.util.Arrays;

public class Level17682 {

  public static int solution(String dartResult) {

    int answer = 0;
    String[] score = dartResult.replaceAll("[A-Z]", " ")
        .replaceAll("[*#]", "").split(" ");
    int[] sc = {
        Integer.parseInt(score[0]),
        Integer.parseInt(score[1]),
        Integer.parseInt(score[2]),
    };


    String[] bonus = dartResult.replaceAll("[0-9]", " ")
        .replaceAll("  ", " ").trim().split(" ");

    for (int i = 0; i < bonus.length; i++) {

      if (bonus[i].equals("")) {
        continue;
      }

      switch (bonus[i].charAt(0)) {
        case 'S': sc[i] *= 1; break;
        case 'D': sc[i] *= sc[i]; break;
        case 'T': sc[i] *= (sc[i] * sc[i]); break;
      }

      if (bonus[i].contains("*")) {
        for (int j = i-1 < 0 ? i: i-1; j <= i; j++) {
          sc[j] *= 2;
        }
      }

      if(bonus[i].contains("#")) {
        sc[i] *= -1;
      }
    }

    return sc[0]+sc[1]+sc[2];
  }

  public static void main(String[] args) {
    System.out.println(solution("1S2D*3T") + " | 원하는 답 : 37");
    System.out.println(solution("1D2S#10S") + " | 원하는 답 : 9");
    System.out.println(solution("1D2S0T") + " | 원하는 답 : 3");
    System.out.println(solution("1S*2T*3S") + " | 원하는 답 : 23");
    System.out.println(solution("1D#2S*3S") + " | 원하는 답 : 5");
    System.out.println(solution("1T2D3D#") + " | 원하는 답 : -4");
    System.out.println(solution("1D2S3T*") + " | 원하는 답 : 59");
  }
}
