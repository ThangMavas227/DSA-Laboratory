package Problem07_SinglyTickets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StopList list = new StopList();

        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            String command = sc.next();

            switch (command) {
                case "ADD_FIRST":
                    list.addFirst(sc.nextInt());
                    break;

                case "ADD_LAST":
                    list.addLast(sc.nextInt());
                    break;

                case "REMOVE":
                    System.out.println(
                        list.remove(sc.nextInt())
                    );
                    break;

                case "FIND":
                    System.out.println(
                        list.find(sc.nextInt())
                    );
                    break;

                case "LIST":
                    list.display();
                    break;
            }
        }

        sc.close();
    }
}
