public class ReformatTheString {
    public String reformat(String s) {

        if(s.length() == 0 || s.length() == 1 ) {
            return s;
        }

        if(s.contains("^[0-9]*$") || s.contains("^[a-Z*$")){
            return "";
        }

        StringBuilder digits = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(Character.isLetter(c)) {
                alphabets.append(c);
            }

            if(Character.isDigit(c)) {
                digits.append(c);
            }
        }

        if(Math.abs(digits.length() - alphabets.length()) > 1) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int a = 0, d = 0;
        boolean digitStart = false;

        if(digits.length() > alphabets.length()) {
            result.append(digits.charAt(d));
            digitStart = true;
            d++;
        }else if(digits.length() < alphabets.length()) {
            result.append(alphabets.charAt(a));
            a++;
        }

        while (d < digits.length() && a < alphabets.length()) {
            if (digitStart) {
                result.append(alphabets.charAt(a));
                result.append(digits.charAt(d));
            } else {
                result.append(digits.charAt(d));
                result.append(alphabets.charAt(a));
            }

            a++;
            d++;
        }


        return result.toString();
    }
}
