import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }

        Set<Character> charArr = new HashSet<>();

        int start = 0, length = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // set 안에 c가 있다면 모든 맵의 알파벳들을 삭제하고 start포인터 이동
            if (charArr.contains(c)) {
                while (start < i && charArr.contains(c)) {
                    charArr.remove(s.charAt(start++));
                }
            }
            charArr.add(c);

            // start와 i를 빼줘야 만약 set이 초기화 되었을 때 같이 초기화 가능
            length = i - start + 1;
            
            // 제일 컸던 글자수의 길이를 찾음
            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {
        if(s.equals("")) return 0;
        if(s.length() == 1) return 1;

        Set<Character> characterSet = new HashSet<>();
        int start = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(characterSet.contains(c)) {
            max = Math.max(characterSet.size(), max);

            while (start < i && characterSet.contains(c)){
                characterSet.remove(s.charAt(start++));
            }
            }

            characterSet.add(c);
            max = Math.max(characterSet.size(), max);
        }

        return max;
    }
}
