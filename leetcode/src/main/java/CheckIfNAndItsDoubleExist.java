import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j & arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkIfExist2(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int result = binarySearch(arr, arr[i] * 2);
            if (result != -1 && i != result) {
                return true;
            }
        }
        return false;
    }

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public boolean checkIfExist3(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(2 * arr[i]) ||
                    set.contains(arr[i] / 2) && arr[i] % 2 == 0 )
                return true;
            set.add(arr[i]);
        }
        return false;
    }
}
