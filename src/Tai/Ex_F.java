//test
import java.util.*;

public class Ex_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long W = sc.nextLong();

        long[] diff = new long[200002];

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            int T = sc.nextInt();
            long P = sc.nextLong();

            diff[S] += P;
            diff[T] -= P;
        }

        long sum = 0;

        for (int i = 0; i <= 200000; i++) {
            sum += diff[i];

            if (sum > W) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
