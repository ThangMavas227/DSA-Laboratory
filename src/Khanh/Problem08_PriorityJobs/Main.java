package Problem08_PriorityJobs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleDispatch dispatch = new VehicleDispatch();

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String cmd = sc.next();

            if (cmd.equals("ADD")) {
                String id = sc.next();
                int priority = sc.nextInt();
                dispatch.ADD(id, priority);
            } else if (cmd.equals("SERVE")) {
                dispatch.SERVE();
            }
        }
    }
}