package ExerciseC;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> candies = new HashMap<>();
        for (int i = 0; i < k; i++) {
            candies.put(a[i], candies.getOrDefault(a[i], 0) + 1);
        }
        int maxGets = candies.size();

        for (int i = k; i < n; i++) {
            int out = a[i - k];
            candies.put(out, candies.get(out) - 1);

            if (candies.get(out) == 0) {
                candies.remove(out);
            }

            candies.put(a[i], candies.getOrDefault(a[i], 0) + 1);

            maxGets = Math.max(maxGets, candies.size());
        }

        System.out.println(maxGets);
    }
}
