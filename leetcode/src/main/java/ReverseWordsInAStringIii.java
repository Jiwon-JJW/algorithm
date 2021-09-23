import java.util.Arrays;

public class ReverseWordsInAStringIii {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        reverse(0, words);

        return String.join(" ", words);
    }

    public void reverse(int index, String[] words) {
        if(words.length == index) {
            return;
        }
        char[] arr = words[index].toCharArray();
        int n = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            char c = arr[n];
            arr[n] = arr[i];
            arr[i] = c;
            --n;
        }

        words[index] = String.valueOf(arr);
        index++;
        reverse(index, words);
    }
}
