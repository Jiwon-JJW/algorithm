public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {

        StringBuffer sb = new StringBuffer();

        while (columnNumber > 0) {
            columnNumber--; // 'A'를 더하면 0부터 A임. 당연함 65를 더함.
            int title = columnNumber % 26;
            sb.insert(0, (char)(title + 'A'));
            columnNumber/=26;
        }
        return sb.toString();
    }
}
