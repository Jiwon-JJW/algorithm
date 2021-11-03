public class SpecialArrayWithXElementsGreater {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= n) {
                count++;
            }
        }

        if (count == n) {
            return n;
        }

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] >= nums[i]) {
                    count++;
                }
            }
            if (count == nums[i]) {
                return nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }

        return -1;
    }

    public int specialArray2(int[] nums) {
        int low = 1;
        int high = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int x = check(mid, nums);
            if (x > mid) {
                low = mid + 1;
            } else if (x < mid) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    public int check(int x, int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (x <= nums[i]) {
                count++;
            }
        }
        return count;
    }
}
