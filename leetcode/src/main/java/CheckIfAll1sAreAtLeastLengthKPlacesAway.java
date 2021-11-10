public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        // 처음부터 1인 경우를 피하기 위해 k를 입력해준다
        int count = k;

        for (int num : nums) {
            // num이 1이라면
            if (num == 1) {
                // 카운트와 K를 비교해 k보다 작다면 false를 리턴
                if (count < k) {
                    return false;
                }
                // count를 다시 0으로 세팅한다
                count = 0;

                // num이 0이라면
            } else {
                // 카운터의 개수를 올린다
                ++count;
            }
        }
        return true;
    }
}
