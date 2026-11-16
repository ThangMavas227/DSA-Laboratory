package Nguyen;
import java.util.*;

public class SnukePrime {
    static class event {
        long day;
        long change;
        event(long day, long change) {
            this.day = day;
            this.change = change;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        event[] events = new event[2 * n];
       for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            events[2 * i] = new event(a, c);
            events[2 * i + 1] = new event(b + 1, -c);
        }
        Arrays.sort(events, (e1, e2) -> Long.compare(e1.day, e2.day));
        long total = 0;
        long current = 0;
        long prev = events[0].day;
        int i = 0;
        while (i < 2 * n) {
            long day = events[i].day;
            long days = day - prev;
            total += days * Math.min(current, x);
            while (i < 2 * n && events[i].day == day) {
                current += events[i].change;
                i++;
            }
            prev = day;
        }
        System.out.println(total);
        sc.close();
    }
}