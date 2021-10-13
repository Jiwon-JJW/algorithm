public class ConvertIntegerToTheSum {
    public int[] getNoZeroIntegers(int n) {
        int a = 1;
        int b = n -1;
        while (a <= b) {
            if(zeroCheck(a) && zeroCheck(b)) {
                return new int[] {a, b};
            }
            a++;
            b--;
        }
        return null;
    }

    private boolean zeroCheck(int a) {
        while (a != 0) {
            int temp = a % 10;
            if(temp == 0) {
                return false;
            }
            a /= 10;
        }
        return true;
    }
}
