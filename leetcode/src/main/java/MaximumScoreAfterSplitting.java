public class MaximumScoreAfterSplitting {
    public int maxScore(String s) {
        int zero = 0;
        for(char c : s.toCharArray()) {
            if(c == '0') zero ++;
        }

        int left = 0;
        int right = s.length() - zero;
        int max = 0;

        for(char c : s.toCharArray()) {
            if(c == '0') left ++;
            if(c == '1') right--;
            max = Math.max(max, left+right);
        }
//        for(int i = 0; i < s.length() - 1; i++) {
//            if(s.charAt(i) == '0')
//                left++;
//            if(s.charAt(i) == '1')
//                right--;
//            max = Math.max(max, left+right);
//        }

        return max;
    }
}
