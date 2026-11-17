package Hao;
import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int ans = 0;

        for (int x : map.keySet()) {
            int count = map.get(x);

            if (count >= x) {
                ans += count - x;
            } else {
                ans += count;
            }
        }

        System.out.println(ans);
    }
}