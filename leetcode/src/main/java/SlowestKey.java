import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] num = new int[releaseTimes.length];
        num[0] = releaseTimes[0];
        int x = releaseTimes[0];
        int max = x;

        for(int i = 1; i < releaseTimes.length; i++) {
            num[i] = releaseTimes[i] - x;
            if(num[i] > max) {
               max = num[i];
            }
            x = releaseTimes[i];
        }

        List<Character> a = new ArrayList<>();
        for(int i = 0; i < keysPressed.length(); i++) {
            if(max == num[i]) {
                a.add(keysPressed.charAt(i));
            }
        }

        Collections.sort(a);

        return a.get(a.size()-1);
    }
}
