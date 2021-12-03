public class FindTheDifference {
    static public char findTheDifference(String s, String t) {

        return (char) (t.chars().sum() - s.chars().sum());
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("a","aa"));
    }
}
