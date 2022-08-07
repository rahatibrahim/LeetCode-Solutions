public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1, end = n;

        while (start <= end) {
            // to avoid overflow
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static boolean isBadVersion(int version) {
        return false;
    }
}
