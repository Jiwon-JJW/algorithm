import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[n];
                nums[n] = nums[i];
                nums[i] = tmp;
                n++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[] {0,1,0,3,12});
    }
}
