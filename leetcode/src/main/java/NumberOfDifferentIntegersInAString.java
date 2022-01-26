import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {
    public int numDifferentIntegers(String word) {
        String[] words = word.replaceAll("[a-z]"," ").split(" ");

        Set<String> nums = new HashSet<>();

        for(String s : words) {
            if(!s.isEmpty())
                nums.add(s.replaceAll("^0*", "")); //앞에 0이 붙은 숫자 0제거
        }

        return nums.size();
    }
}
