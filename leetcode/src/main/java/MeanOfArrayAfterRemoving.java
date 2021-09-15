import java.util.Arrays;

public class MeanOfArrayAfterRemoving {
    public double trimMean(int[] arr) {

        // 문제는 입력받은 리스트 중에서 작은값 5% 큰값 5%를 제외한 모든 값의 평균을 구하는 문제입니다.
        //
        // 따라서 n 변수에 전체 리스트 길이의 5%를 구하고
        //
        // 그 사이에 있는 값들만 변수 sum에 입력해서 평균 값을 구해내는 것 입니다.

        Arrays.sort(arr);

        int n = (int) Math.ceil(arr.length * 0.05);
        double sum = 0;
        for (int i = n; i < arr.length - n; i++) {
            sum += arr[i];
        }
        return (sum / (arr.length - 2 * n)); // 전체 길이에서 작은값 5%, 큰 값 5%를 제외한 길이로 평균을 낸다.
    }
}
