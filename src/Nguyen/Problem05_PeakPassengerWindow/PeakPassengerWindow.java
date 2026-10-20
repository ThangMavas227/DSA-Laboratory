 package   Nguyen.Problem05_PeakPassengerWindow;
import java.util.ArrayDeque;
import java.util.Deque;

public class PeakPassengerWindow {
//method a
    public int[] directScanMax(int[] a, int k) {
        if (k < 1 || k > a.length) {
            throw new IllegalArgumentException("Invalid window size");
        }
        
        int n = a.length;
        int[] result = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            int max = a[i];
            for (int j = 1; j < k; j++) {
                if (a[i + j] > max) {
                    max = a[i + j];
                }
            }
            result[i] = max;
        }
        return result;
    }
//method b
    public int[] monotonicDequeMax(int[] a, int k) {
        if (k < 1 || k > a.length) {
            throw new IllegalArgumentException("Invalid window size");
        }
        
        int n = a.length;
        int[] answer = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); 
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                answer[i - k + 1] = a[dq.peekFirst()];
            }
        }
        return answer;
    }
}