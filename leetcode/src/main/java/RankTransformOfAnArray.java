import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(temp);

        for(int i = 0; i < arr.length; i++) {
            // 중복된 값을 허용하지않는다
            if(!map.containsKey(temp[i])){
                // 값이 중복될 경우 맵의 사이즈에서 +1을 해야 정확한 순번 값이 들어가기 때문에
                map.put(temp[i], map.size()+1);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            // 키 값에 맞는 순번을 배열에 넣는다
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
