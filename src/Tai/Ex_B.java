
import java.util.*;

public class Ex_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int K = sc.nextInt();

        long[] x = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i <= n - K; i++) {
            long L = x[i];
            long R = x[i + K - 1];

            long time = (R - L) + Math.min(Math.abs(L), Math.abs(R));

            ans = Math.min(ans, time);
        }

        System.out.println(ans);
        sc.close();
    }
}
