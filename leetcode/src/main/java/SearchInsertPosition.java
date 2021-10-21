public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 1 && nums[0] < target) return 1;
        if (nums.length == 1 && nums[0] > target) return 0;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }

    public int searchInsert2(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] < target) return 1;
            else if (nums[0] > target) return 0;
        }
        int low = 0;
        int high = nums.length - 1;

        return binarySearch(nums, low, high, target);

    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return low;
        }

        int mid = (low + high) / 2;

        if (nums[mid] > target) {
            return binarySearch(nums, low, mid - 1, target);
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, high, target);
        }

        return mid;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }
}
