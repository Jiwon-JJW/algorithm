public class LongerContiguousSegments {
    public boolean checkZeroOnes(String s) {
        int zero = 0;
        int one = 0;
        int max0 = 0;
        int max1 = 0;
        for(char c : s.toCharArray()) {
            if(c - '0' == 0) {
                zero ++;
                one = 0;
                max0 = Math.max(max0, zero);
            } else if(c - '0' == 1) {
                one ++;
                zero = 0;
                max1 = Math.max(max1, one);
            }
        }

        return max0 < max1;
    }
}
