public class RemoveElementToMakeTheArray {
    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] >= nums[i + 1]) {
                count++;
                if (i > 0 && nums[i - 1] >= nums[i + 1])
                    // 정렬을 위함. 큰 수로 변경 해 주면서 카운트를 올바르게 셀 수 있도록.
                    //2차이나도 돼야함
                    nums[i+1] = nums[i];
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        canBeIncreasing(new int[] {2,3,1,2});
    }

}
