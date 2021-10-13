public class RedistributeCharacters1897 {
    public boolean makeEqual(String[] words) {
        int[] alphabet = new int[26];

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++) {
                alphabet[words[i].charAt(i)-'a'] ++;
            }
        }

        for(int i : alphabet) {
            if(i % alphabet.length != 0) return true;
        }

        return false;
    }
}
