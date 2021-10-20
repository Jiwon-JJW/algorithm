public class QueriesOnNumberOfPoints {


    public int[] countPoints2(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;

            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            for (int j = 0; j < points.length; j++) {
                int x1 = points[j][0];
                int y1 = points[j][1];

                int dis = (int) Math.ceil(Math.sqrt(Math.pow((x1 - x), 2) + Math.pow(y1 - y, 2)));

                if(dis <= r) {
                    count++;
                }
            }

            ans[i] = count;
        }
        return ans;
    }
}
