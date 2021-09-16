public class BinarySearch {
    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int search2(int[] nums, int target) {
        // 이진트리 검색 방법. O(log n)
        if (nums.length == 1 && nums[0] != target) {
            return -1;
        } else if (nums.length == 1) {
            return 0;
        }

        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex <= highIndex) {
            int mid = (lowIndex + highIndex) / 2;

            if (nums[mid] < target) {
                lowIndex = mid + 1;
            } else if (nums[mid] > target) {
                highIndex = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
