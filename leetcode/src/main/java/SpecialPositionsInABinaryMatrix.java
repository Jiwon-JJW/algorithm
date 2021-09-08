public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        int[] mCount = new int[m];
        int[] nCount = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    mCount[i]++;
                    nCount[j]++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && mCount[i] == 1 && nCount[j] == 1) {
                count++;
                }
            }
        }
        return count;
    }
}
