import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();

        //배열 안에 든 수의 최대 값 n은 배열의 최종 사이즈와 같으니, 배열 내의 값을 인덱스로 치환해 해당 인덱스의 값을 음수로 변경한다.
        //nums = [4,3,2,7,8,2,3,1]의 경우, 순서대로 3,2,1,6,7,1,2,0 번의 인덱스의 값을 음수로 변경하는 것이다.
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]) - 1;
            nums[temp] = -(Math.abs(nums[temp]));
        }

        // 그렇게 될 경우, 결국 없는 숫자가 무엇인지 인덱스를 통해 알 수 있다. 위의 반복문을 돌고 나면,
        // nums = [-4,-3,-2,-7,8,-2,-3,1] 가 되는데, 결론적으로 살펴보면 배열 내에 5와 6(인덱스+1)이 없음을 알 수 있다.
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) {
                arr.add(j + 1);
            }
        }

        return arr;
    }
}
