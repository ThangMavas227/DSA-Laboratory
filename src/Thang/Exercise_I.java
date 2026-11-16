package ExerciseC;

import java.util.Scanner;

public class Exercise_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int l = 0; l < n; l++) {
            int min = a[l];
            for (int r = l; r < n; r++) {
                min = Math.min(min, a[r]);
                int organs = ((r - l) + 1) * min;
                max = Math.max(organs, max);
            }
        }
        System.out.println(max);
    }
}
