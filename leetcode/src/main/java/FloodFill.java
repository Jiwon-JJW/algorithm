public class FloodFill {
//    private int[][] answer;
//    private int mainColor;
//    private int newColor;
//
//    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        this.answer = image;
//        this.mainColor = image[sr][sc];
//        this.newColor = newColor;
//
//        if (mainColor == newColor) {
//            return image;
//        }
//
//        dfs(sr, sc);
//        return answer;
//    }
//
//    public void dfs(int sr, int sc) {
//        if (sr < 0 || sc < 0 || sr >= answer.length || sc >= answer[sr].length ||
//                answer[sr][sc] != mainColor) {
//            return;
//        }
//
//        answer[sr][sc] = newColor;
//
//        // 인접하는 곳의 mainColor를 image에서 탐색하며 컬러를 바꿈.
//        dfs(sr + 1, sc);
//        dfs(sr - 1, sc);
//        dfs(sr, sc + 1);
//        dfs(sr, sc - 1);
//    }



















    int[][] imageC;
    int mainColor;
    int newColorC;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        imageC = image;
        mainColor = image[sr][sc];
        newColorC = newColor;

        dfs(sr, sc);

        return imageC;
    }

    public void dfs(int sr, int sc) {
        if(sr < 0 || sc < 0 || sr >= imageC.length || sc >= imageC[0].length
                || imageC[sr][sc] == newColorC || imageC[sr][sc] != mainColor) {
            return;
        }

        imageC[sr][sc] = newColorC;

        dfs(sr - 1, sc);
        dfs(sr + 1, sc);
        dfs(sr, sc - 1);
        dfs(sr, sc + 1);
    }

}
