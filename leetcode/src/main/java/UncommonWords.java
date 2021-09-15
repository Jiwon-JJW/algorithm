import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();

        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");

        for(String s : s1Arr) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s : s2Arr) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        List<String> answerList = new ArrayList<>();

        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                answerList.add(key);
            }
        }

        return answerList.toArray(new String[answerList.size()]);
    }
}
