public class CountSquareSumTriples {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int triple = (i * i) + (j * j);
                int sqrt = (int) Math.sqrt(triple);
                if (sqrt > n) {
                    break;
                }
                if (sqrt == triple) {
                    count++;
                }
            }
        }

        return count;
    }
}
