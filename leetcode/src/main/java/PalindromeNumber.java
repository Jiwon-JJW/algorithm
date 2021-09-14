public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int palindrome = 0;
        while (temp != 0) {
            palindrome = (palindrome * 10) + (temp % 10);
            temp /= 10;
        }

        return x == palindrome;
    }
}
