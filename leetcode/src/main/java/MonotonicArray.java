public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        return plus(nums) || minus(nums);
    }

    public boolean plus(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean minus(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                return false;
            }
        }

        return true;
    }
}
