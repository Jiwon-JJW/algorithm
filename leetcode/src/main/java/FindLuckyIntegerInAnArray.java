public class FindLuckyIntegerInAnArray {
    public static int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int i : arr) {
            count[i]++;
        }

        for(int i = 500; i > 0; i--) {
            if(count[i] == i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
