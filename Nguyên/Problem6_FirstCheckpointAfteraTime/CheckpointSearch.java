package Problem6_FirstCheckpointAfteraTime;
public class CheckpointSearch {
    public static int findFirstCheckpointAfter(int[] a, int t) {
        if (a == null || a.length == 0) {
            return 0;
        }
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
