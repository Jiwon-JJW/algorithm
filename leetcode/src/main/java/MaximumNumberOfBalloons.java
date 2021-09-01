public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        long b = countChar(text, 'b');
        long a = countChar(text, 'a');
        long n = countChar(text, 'n');
        long l = countChar(text, 'l') / 2;
        long o = countChar(text, 'o') / 2;

        return (int) Math.min(Math.min(b,Math.min(a,Math.min(n,l))),o);
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
    }
}
