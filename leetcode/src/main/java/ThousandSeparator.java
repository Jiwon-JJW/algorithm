public class ThousandSeparator {
    public static String thousandSeparator(int n) {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(n));

        int length = stringBuffer.length() - 3;

        while (length > 0) {
            stringBuffer.insert(length, ".");
            length -= 3;
        }
//        밑의 애가 위에 애보다 더 느림..
//        int length = stringBuffer.length();
//
//        while ((length -= 3) > 0) {
//            stringBuffer.insert(length, ".");
//        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(123456789));
    }
}
