public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        // s1이 s2에 포함되어있는지 확인 해야 하므로 크기가 더 크면 false
        if(s1.length() > s2.length()) {
            return false;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        // 알파벳의 개수를 세기 위함.
        int[] count = new int[26];

        for (int i = 0; i < len1; i++) {
            // a = 0 의 인덱스로 해당 알파벳의 인덱스의 값을 1씩 올려줌
            // 같은 느낌으로 s2에 해당되는 인덱스의 값은 1씩 내려줌
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        if(checkZero(count)) {
            return true;
        }

        // s1.length() 크기의 윈도우를 만들어 우측으로 1씩 이동하며 알파벳들을 확인하고
        // 만약 모든 배열이 0이 된다면 s1이 s2에 해당 되는 것이므로 true
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a'] --;
            count[s2.charAt(i - len1) - 'a']++;

            if(checkZero(count)) return true;
        }

        return false;
    }

    // count 배열이 모두 0의 값을 갖고 있다면 true
    public boolean checkZero(int[] count) {
        for(int i : count) {
            if(i != 0) {
                return false;
            }
        }

        return true ;
    }
}
