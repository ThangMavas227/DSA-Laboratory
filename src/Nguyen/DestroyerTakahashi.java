package Nguyen;

import java.util.*;

public class DestroyerTakahashi {
    static class interval {
        long left, right;
        interval(long left, long right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long k = 1_000_000_000L - x + 1;
        interval[] intervals = new interval[n];

        for (int i = 0; i < n; i++) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long left = Math.max(1L, l - x + 1);
            long right = Math.min(r, k);
            intervals[i] = new interval(left, right);
        }
        Arrays.sort(intervals, Comparator.comparingLong(a -> a.right));
        long lastPunch = -1;
        int answer = 0;
        for (interval interval : intervals) {
            if (lastPunch < interval.left) {
                lastPunch = interval.right;
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
