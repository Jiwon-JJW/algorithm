import java.util.Arrays;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();

        int low = 0;
        int high = s.length() -1;

        while (low <= high) {
            char tmp = chars[low];

            // 문자인지 아닌지 여부를 확인하는 메서드!
            if(!Character.isLetter(tmp)) {
                low++;
                continue;
            }
            if(!Character.isLetter(chars[high])) {
                high--;
                continue;
            }
            chars[low] = chars[high];
            chars[high] = tmp;

            low++;
            high--;
        }

        return String.copyValueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }
}
