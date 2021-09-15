import java.util.StringTokenizer;

public class CheckIfAWordOccursAsAPrefixOfAny {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 1; i <= words.length; i++) {
            if (words[i - 1].startsWith(searchWord)) return i;
        }
        return -1;
    }

}
