import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long X = sc.nextLong();
        long Y = sc.nextLong();

        long cost = 0;

        if (X <= Y) {
            if (A + B < 2 * C) {
                cost = X * (A + B);
            } else {
                cost = X * 2 * C;
            }

            if (B < 2 * C) {
                cost += (Y - X) * B;
            } else {
                cost += (Y - X) * 2 * C;
            }
        } else {
            if (A + B < 2 * C) {
                cost = Y * (A + B);
            } else {
                cost = Y * 2 * C;
            }

            if (A < 2 * C) {
                cost += (X - Y) * A;
            } else {
                cost += (X - Y) * 2 * C;
            }
        }

        System.out.println(cost);
    }
}