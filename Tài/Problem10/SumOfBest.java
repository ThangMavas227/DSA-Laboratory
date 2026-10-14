package Problem10;

public class SumOfBest {
    public static long sumOfBest(int[] arr, int start, int end) {
        long total = 0;

        for (int i = start; i <= end; i++) {
            total += arr[i];
        }

        return total;
    }
}
