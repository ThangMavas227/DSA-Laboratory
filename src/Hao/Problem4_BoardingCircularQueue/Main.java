package Problem4_BoardingCircularQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int capacity = input.nextInt();
        int CommandNumber = input.nextInt();

        CircularQueue queue = new CircularQueue(capacity);

        for (int i = 0; i < CommandNumber; i++) {

            String command = input.next();

            if (command.equals("ENQ")) {

                int x = input.nextInt();

                if (queue.isFull()) {
                    System.out.println("FULL");
                } else {
                    queue.enqueue(x);
                }

            } else if (command.equals("SERVE")) {

                if (queue.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(queue.dequeue());
                }

            } else if (command.equals("FRONT")) {

                if (queue.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(queue.peek());
                }

            } else if (command.equals("SIZE")) {

                System.out.println(queue.size());
            }
        }

        input.close();
    }
}
