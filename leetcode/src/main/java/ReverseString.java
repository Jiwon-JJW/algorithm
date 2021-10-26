public class ReverseString {

    public static void reverseString2(char[] s) {
        int index = s.length-1;

        for(int i = 0; i < s.length/2; i++) {

            char c = s[index];
            s[index] = s[i];
            s[i] = c;
            --index;
        }
    }

    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low < high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        reverseString2(new char[]{'h','e','l','l','o'});
    }

}
