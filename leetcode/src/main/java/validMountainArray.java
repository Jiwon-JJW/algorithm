public class validMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        boolean increasing = arr[1] > arr[0];

        if (!increasing) return false; //처음부터 올라가지 않는다면 산이 형성되지않음.

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) return false;
            if (increasing) {
                if (arr[i] < arr[i - 1]) increasing = false;
            } else {
                if (arr[i] > arr[i - 1]) return false;
            }
        }

        return !increasing; //포문 돌면서 바꿔뒀으니까.
    }
}
