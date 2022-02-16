import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int length = s.length();

        for(int i = 0; i < length; i++) {
            char c = s.charAt(i);

            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < length; i++) {
            if(count.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
