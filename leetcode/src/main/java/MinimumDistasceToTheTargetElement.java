public class MinimumDistasceToTheTargetElement {
    public static int getMinDistance(int[] nums, int target, int start) {
        if (nums.length == 1)
            return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                min = Math.abs(i - start);
                break;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,}
        ,1
        ,0));
    }
}
