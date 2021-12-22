public class BuddyStrings {
//    public boolean buddyStrings(String s, String goal) {
//        if(s.length() != goal.length()) {
//            return false;
//        }
//
//        if(s.equals(goal)) {
//            int[] count = new int[26];
//            for(int i = 0; i < s.length(); i++) {
//                count[s.charAt(i) - 'a']++;
//            }
//
//            for(int c : count) {
//                //글자가 두 개가 같은게 있다는 것이니 트루. 아니면 펄스.
//                if(c > 1) return true;
//            }
//            return false;
//        } else  {
//            int first = -1, second = -1;
//            for(int i = 0 ; i < s.length(); i++) {
//                if(s.charAt(i) != goal.charAt(i)) {
//                    if(first == - 1) {
//                        first = i;
//                    } else if(second == -1) {
//                        second = i;
//                    } else
//                        return false;
//                }
//            }
//
//            return (second != -1 // IndexOutOfBoundedException이 일어나지 않도록.
//                    && s.charAt(first) == goal.charAt(second) && // 서로 값이 뒤바뀌었을 때 true여야 하므로.
//                    s.charAt(second) == goal.charAt(first));
//        }
//    }












    public boolean buddyStrings2(String s, String goal) {
        if ( s.length() != goal.length() ) {
            return false;
        }

        if(s.equals(goal) ) {
            int[] count = new int[26];

            for(int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            for(int i : count) {
                if(i > 1) {
                    return true;
                }
            }
            return false;
        }

        int first = -1, second = -1;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                if(first == -1) {
                    first = i;
                } else if(second == -1) {
                    second = i;
                } else {
                    return false;
                }
            }
        }

        return (second != -1 &&
                s.charAt(first) == goal.charAt(second) &&
                s.charAt(second) == goal.charAt(first));
    }
}
