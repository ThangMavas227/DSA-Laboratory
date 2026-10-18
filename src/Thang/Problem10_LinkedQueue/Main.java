package Thang.Problem10_LinkedQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StationIncident<Integer> station = new StationIncident<>();
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String[] s = sc.nextLine().trim().split("\\s+");
            switch (s[0]) {
                case "ENQ":
                    int num = Integer.parseInt(s[1]);
                    station.ENQ(num);
                    break;
                case "SERVE":
                    var v = station.SERVE();
                    System.out.println(v != null ? v : "EMPTY");
                    break;
                case "FRONT":
                    var f = station.FRONT();
                    System.out.println(f != null ? f : "EMPTY");
                    break;
                case "SIZE":
                    System.out.println(station.getSize());
                    break;
            }
        }

    }
}
