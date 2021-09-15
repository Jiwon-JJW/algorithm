public class CalculateMoneyInLeetcodeBank {
    public static int totalMoney(int n) {
        int answer = 0;
        int money = 1;
        int week = 1;

        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                answer = answer + week;
                week = week + 1;
                money = week;
            } else {
                answer = answer + money;
                money++;
            }
        }

        return answer;
    }

    public int totalMoney2(int n) {
        int res = 0;
        int t = 1;
        int p = 1;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                res = res + p;
                p = p + 1;
                t = p;
            } else {
                res = res + t;
                t++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
    }
}
