public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);


            for(int i = 1; i < strs.length; i++) {
                for(int j = 0; j < sb.length(); j++) {
                    if(strs[i].length() == j || sb.charAt(j) != strs[i].charAt(j)) {
                        sb.delete(j, sb.length());
                    }
                }
            }

        return sb.toString();
    }
}
