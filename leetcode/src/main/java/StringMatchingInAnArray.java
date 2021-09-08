import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];

                if (word1.contains(word2) && !answer.contains(word2)) {
                    answer.add(word2);
                } else if (word2.contains(word1) && !answer.contains(word1)) {
                    answer.add(word1);
                }
            }
        }

        return answer;
    }
}
