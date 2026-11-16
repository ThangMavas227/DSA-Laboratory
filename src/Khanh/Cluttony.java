package exerciseDJ;
import java.util.Scanner;
import java.util.*;

public class Cluttony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long K = sc.nextLong();
        long[] A =  new long[n];
        long[] F = new long[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextLong();
        }

        for (int i = 0; i < F.length; i++) {
            F[i] = sc.nextLong();
        }

        Arrays.sort(A);
        Arrays.sort(F);


        for (int i = 0; i < n / 2; i++) {
            long temp = A[i];
            A[i] = A[n - 1 - i];
            A[n - 1 - i] = temp;
        }


        long left = -1;
        long right = 1_000_000_000_000L;

        while (right - left > 1) {
            long mid = left + (right - left) / 2;

            if (canAchieve(mid, A, F, K)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        System.out.println(right);
    }

    public static long countTraining(long mid, long[] A, long[] F) {
        long total = 0;

        for (int i = 0; i < A.length; i++) {
            long training = Math.max(0L, A[i] - mid / F[i]);
            total += training;
        }

        return total;
    }


    public static boolean canAchieve(long mid, long[] A, long[] F, long K) {
        return countTraining(mid, A, F) <= K;
    }
}
