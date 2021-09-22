public class MinimumValueToGetPositiveStepByStepSum {
    public static int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for (int i : nums) {
            sum += i;
            min = Math.min(sum, min);
            System.out.println("min:" + min);
        }

        return (min * -1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3, 2, -3, 4, 2}));
        System.out.println(minStartValue(new int[]{1, 2}));
    }
}
