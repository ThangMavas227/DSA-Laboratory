package Problem04_MuseumCatalogue;

public class MuseumCatalogue {

    public static RecordResult binarySearch(int[] a, long target, boolean trace) {
        long inspected = 0;
        int low = 0;
        int high = a.length - 1;
        if (trace) {
            System.out.printf("%-6s %-6s %-6s %-6s%n", "low", "high", "mid", "a[mid]");
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            inspected++;
            if (trace) {
                System.out.printf("%-6d %-6d %-6d %-6d%n", low, high, mid, a[mid]);
            }
            if (a[mid] == target) {
                return new RecordResult(mid, inspected);
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new RecordResult(-1, inspected);
    }

    public static RecordResult linearSearch(int[] a, long target) {
        long inspected = 0;
        for (int i = 0; i < a.length; i++) {
            inspected++;
            if (a[i] == target) {
                return new RecordResult(i, inspected);
            }
        }
        return new RecordResult(-1, inspected);
    }
}