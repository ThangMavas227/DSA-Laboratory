package   Nguyen.Problem05_PeakPassengerWindow;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        PeakPassengerWindow solver = new PeakPassengerWindow();
        int[] result = solver.monotonicDequeMax(a, k);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        
        scanner.close();
    }
}
