public class MajorityElement {
    public static int majorityElement(int[] nums) {
        // 어차피 2/n 이상 존재하는 수는 2개 중 하나는 무조건 그 수가 중복으로 등장할테니까
        // 처음부터 수를 확인하면서 카운트가 0이 되지 않는다면 그 수가 정답이고
        // 카운트가 0이 되면 그 수가 정답이 아니게 되니, 다음 숫자를 체크해나가면서 풀 수 있다.
        int count = 0; int answer = 0;

        for(int i : nums) {
            if(count == 0) {
                answer = i;
            }

            if(i == answer) {
                count ++;
            } else {
                count--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }
}
