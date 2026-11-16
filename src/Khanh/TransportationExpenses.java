package exerciseDJ;
import java.util.*;

public class TransportationExpenses {
    static long[] A;
    static int N;
    static long M;

    static long min(long x, long a) {
        return Math.min(x, a);
    }

    static long totalSubsidy(long x) {
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += min(x, A[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextLong();

        A = new long[N];
        long total = 0;
        long maxA = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            total += A[i];
            maxA = Math.max(maxA, A[i]);
        }

        if (total <= M) {
            System.out.println("infinite");
            return;
        }

        long left = 0;
        long right = maxA + 1;

        while (right - left > 1) {
            long mid = left + (right - left) / 2;

            if (totalSubsidy(mid) <= M) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.println(left);
    }
}

