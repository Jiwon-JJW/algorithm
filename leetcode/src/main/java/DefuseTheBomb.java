public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        int size = code.length;
        if (k > 0) {
            for (int i = 0; i < size; i++) {
                for (int j = 1; j <= k; j++) {
                    // 순환해야하므로 size를 나눠줌
                    ans[i] += code[(i + j) % size];
                }
            }
        } else if (k < 0) {
            for (int i = 0; i < size; i++) {
                for (int j = k; j < 0; j++) {
                    // 음수면 반시계로 돌아야하니까 음수를 더하는 방식으로 뒤로 가게 하는 것.
                    ans[i] += code[(i + j + size) % size];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(3 % 4);
        System.out.println(2 % 4);
        System.out.println(1 % 4);
    }
}
