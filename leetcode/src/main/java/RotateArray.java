import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }

    private void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            int temp = nums[r];
            nums[r--] = nums[l];
            nums[l++] = temp;
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        rotate(new int[]{1, 2}, 3);
    }
}
