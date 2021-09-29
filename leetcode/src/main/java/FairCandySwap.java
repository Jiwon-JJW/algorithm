public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] answer = new int[2];
        int alice = 0;
        int bob = 0;
        for(int i : aliceSizes) {
            alice += i;
        }
        for(int i : bobSizes) {
            bob += i;
        }

        int totalCandy = (alice + bob) / 2;
        for(int i = 0; i < aliceSizes.length; i++) {
            for(int j = 0; j < bobSizes.length; j++) {
                if(alice - aliceSizes[i] + bobSizes[j] == totalCandy && bob - bobSizes[j] + aliceSizes[i] == totalCandy) {
                    answer[0] = aliceSizes[i];
                    answer[1] = bobSizes[j];
                    return answer;
                }
            }
        }

        return answer;
    }
}
