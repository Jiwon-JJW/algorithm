public class MaximumAscendingSubarraySum {
    public static int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if(num > max) {
                max = num;
            }
            if(num < max) {
                sum = num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[] {10,20,30,5,10,50}));
    }
}
