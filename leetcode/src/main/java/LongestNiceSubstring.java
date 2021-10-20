import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        if(s.length() < 2) {
            return "";
        }
        Set<Character> charSet = new HashSet<>();
        for(Character c : s.toCharArray()) {
            charSet.add(c);
        }

        for(int i = 0; i < s.length(); i++) {
            if (charSet.contains(Character.toUpperCase(s.charAt(i))) &&
                    charSet.contains(Character.toLowerCase(s.charAt(i))))
                continue;

            String string1 = longestNiceSubstring(s.substring(0, i));
            String string2 = longestNiceSubstring(s.substring(i + 1));

            return string1.length() >= string2.length() ? string1 : string2;
        }
        return s;
    }
}
