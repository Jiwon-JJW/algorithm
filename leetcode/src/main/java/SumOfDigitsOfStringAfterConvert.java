public class SumOfDigitsOfStringAfterConvert {
    public static int getLucky(String s, int k) {
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        for(int i = 0; i < k; i++) {
            int a = 0;
            for(int j = 0; j < result.length(); j++) {
                a += result.charAt(j) - '0';
            }
            result = String.valueOf(a);
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii",1));
    }
}
