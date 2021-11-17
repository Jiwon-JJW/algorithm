public class AddDigits {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        while (!(num < 10)) {
            int tmp = num % 10;
            int sum = (num / 10) + tmp;
            num = sum;
        }

        return num;
    }

    public int addDigits2(int num) {
        if (num == 0) {
            return 0;
        }

        return num % 9 == 0? 9 : num % 9;
    }
}
