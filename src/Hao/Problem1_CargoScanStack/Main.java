package Problem1_CargoScanStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int CommandNumber = input.nextInt();

        IntStack stack = new IntStack();

        for (int i = 0; i < CommandNumber; i++) {

            String command = input.next();

            if (command.equals("SCAN")) {
                int x = input.nextInt();
                stack.push(x);

            } else if (command.equals("UNDO")) {

                if (stack.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack.pop());
                }

            } else if (command.equals("LATEST")) {

                if (stack.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack.peek());
                }

            } else if (command.equals("COUNT")) {
                System.out.println(stack.size());
            }
        }

    }
}
