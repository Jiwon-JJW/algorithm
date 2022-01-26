public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];

        // 카드 갯수를 센다
        for (int i : deck) {
            count[i]++;
        }

        int k = count[0];
        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0) {
                k = gcd(k, count[i]);
            }
        }

        return k >= 2;
    }

    // 유클리드 호제법 최대 공약수 구하기
    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
