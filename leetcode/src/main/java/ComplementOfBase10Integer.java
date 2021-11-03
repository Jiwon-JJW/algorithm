public class ComplementOfBase10Integer {
    public int bitwiseComplement(int n) {
        char[] binary = Integer.toBinaryString(n).toCharArray();

        for(int i = 0; i < binary.length; i++) {
            binary[i] = binary[i] == '0' ? '1' : '0';
        }

        return Integer.parseInt(new String(binary), 2);
    }
}
