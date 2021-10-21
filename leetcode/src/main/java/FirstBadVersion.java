public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;

            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }

    public int firstBadVersion2(int n) {
        int low = 1;
        int high = n;

        return binarySearch(low, high);
    }

    private int binarySearch(int low, int high) {
        if(low > high) {
            return low;
        }

        int mid = low + (high - low) / 2;

        if (isBadVersion(mid)) {
            return binarySearch(low, mid - 1);
        } else {
            return binarySearch(mid + 1, high);
        }
    }
}
