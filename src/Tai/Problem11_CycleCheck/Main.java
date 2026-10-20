package Problem11_CycleCheck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = sc.nextInt();

        Node head = null;
        Node tail = null;
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            nodes[i] = new Node(value);

            if (head == null) {
                head = nodes[i];
                tail = nodes[i];
            } else {
                tail.next = nodes[i];
                tail = nodes[i];
            }
        }

        if (n > 0 && pos >= 0 && pos < n) {
            tail.next = nodes[pos];
        }

        System.out.println(CycleCheck.hasCycle(head));

        sc.close();
    }
}

