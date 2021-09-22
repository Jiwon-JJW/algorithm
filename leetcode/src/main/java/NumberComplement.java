public class NumberComplement {
    public int findComplement(int num) {
        StringBuilder answer = new StringBuilder();
        String binary = Integer.toBinaryString(num);

        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                answer.append('0');
            } else if (binary.charAt(i) == '0') {
                answer.append('1');
            }
        }

        return Integer.parseInt(answer.toString(),2);
    }
}
