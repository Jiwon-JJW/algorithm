import java.util.Arrays;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {


        int[] arr = new int[26];

        int max = -1;
        Arrays.fill(arr , -1);

        for(int i = 0; i < s.length(); i++) {
            int n = (int)s.charAt(i) - 'a';
            if(arr[n] == -1) {
                //배열을 사용하여 처음 본 문자의 위치를 저장합니다.
                arr[n] = i;
            } else  {
                //캐릭터가 반복되면 그들 사이의 최대 거리를 확인.
                max = Math.max(max, i - arr[n] - 1);
            }
        }

        return max;
    }
}
