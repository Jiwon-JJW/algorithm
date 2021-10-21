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


    // 효율 0ms 51.8MB
    public int search3(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] == target) return  0;
            else return -1;
        }

        int low = 0;
        int high = nums.length - 1 ;

        return binarySearch(nums, low, high, target);
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(nums[mid] < target) {
            return binarySearch(nums, mid + 1, high, target);
        } else if (nums[mid] > target) {
            return binarySearch(nums, low, mid - 1, target);
        }

        return mid;
    }
}
