package Problem07_SinglyTickets;

public class StopList {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public String remove(int x) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.value == x) {

                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }

                if (current == tail) {
                    tail = previous;
                }

                size--;

                if (size == 0) {
                    head = null;
                    tail = null;
                }

                return "REMOVED";
            }

            previous = current;
            current = current.next;
        }

        return "NOT_FOUND";
    }

    public int find(int x) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.value == x) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    public void display() {
        if (head == null) {
            System.out.println("EMPTY");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.value);

            if (current.next != null) {
                System.out.print(" ");
            }

            current = current.next;
        }

        System.out.println();
    }
}

