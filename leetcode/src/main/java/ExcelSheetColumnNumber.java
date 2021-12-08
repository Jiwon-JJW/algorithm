public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int answer = 0;

        for(char c : columnTitle.toCharArray()) {
            answer *= 26;

            // 아스키코드가 A부터 65니까 64를 빼줌.
            answer += c - 64;
        }

        return answer;
    }

    public int titleToNumber2(String columnTitle) {
        int answer = 0;

        for(int i = columnTitle.length() - 1; i >= 0; i--) {
            answer += ((columnTitle.charAt(i) - 'A') + 1) * answer;
            answer *= 26;
        }

        return answer;
    }
}
