public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int sum = numbers[low] + numbers[high];

            if(sum > target) {
                high--;
            } else if (sum < target) {
                low++;
            } else {
                return new int[] {low, high};
            }
        }

        return null;
    }
}
