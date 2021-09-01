import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        for (int i = stones.length - 1; i > 0; i--) {
            Arrays.sort(stones);
            stones[i - 1] = stones[i] - stones[i - 1];
            stones = Arrays.copyOf(stones, i);
        }

        return stones[0];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
