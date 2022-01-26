public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }

    public int lengthOfLastWord2(String s) {
        int length = 0;

        s = s.trim();

        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ')
                return length;
            else length++;
        }

        return length;
    }
}
