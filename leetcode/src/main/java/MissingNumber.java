public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum -= nums[i];
            sum += i + 1;
        }

        return sum < 0 ? -sum : sum;
    }
}
