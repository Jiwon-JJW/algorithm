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


    public String reverseWords2(String s) {
        String[] arr = s.split(" ");

        int index = 0;
        reverse2(index, arr);

        return String.join(" ", arr);
    }

    public void reverse2(int index, String[] arr) {
        if(index > arr.length - 1) {
            return;
        }
        char[] s = arr[index].toCharArray();
        int low = 0;
        int high = s.length - 1;

        while (low < high) {
            char c = s[low];
            s[low] = s[high];
            s[high] = c;

            low++;
            high--;
        }

        arr[index] = String.valueOf(s);
        reverse2(index+1, arr);
    }
}
