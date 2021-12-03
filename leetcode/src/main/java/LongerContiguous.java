public class LongerContiguous {
    public boolean checkZeroOnes(String s) {

        int maxOne = 0 , maxZero = 0 , one = 0, zero = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
                zero = 0;
                maxOne = Math.max(maxOne, one);

            } else {
                one = 0;
                zero++;
                maxZero = Math.max(maxZero, zero);
            }
        }

        return maxOne > maxZero;
    }
}
