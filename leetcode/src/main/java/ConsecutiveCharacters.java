public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int count = 0;
        int max = 0;
        int c = ' ';

        for(int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if(c == now) count++;
            else {
                count = 1;
                c = now;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
