
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > target) {
                break;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > target) {
                    if ((numbers[j] + numbers[i]) > target) {
                        break;
                    }
                }
                if (numbers[i] + numbers[j] == target) {
                    int[] newArray = new int[2];
                    newArray[0] = i + 1;
                    newArray[1] = j + 1;
                    return newArray;
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        Arrays.sort(numbers);

        int low = 0;
        int high = numbers.length - 1;
        int sum = 0;

        while (low <= high) {
            sum = numbers[low] + numbers[high];
            if( sum == target ) {
                return new int[] {low + 1, high + 1};
            } else if (sum > target) {
                high --;
            } else {
                low ++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
    }
}
