package Problem09_DoublyCatalogue;
// import java.util.LinkedList;

// import org.w3c.dom.Node;

public class TransitItinerary<T> {
    private Node<T> head;
    private Node<T> tail;
    static class Node<T>{
        private int data;
        private Node<T> prev;
        private Node<T> next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void ADD_FIRST(int x){
        Node<T> newNode = new Node<>(x);
          if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void ADD_LAST(int x){
        Node<T> newNode = new Node<>(x);
        if(tail == null) {
            tail = head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String REMOVE(int x) {
    Node<T> current = head;
    while (current != null && current.data != x) {
        current = current.next;
    }
    if (current == null) return "NOT_FOUND";

    if (current.prev == null) head = current.next;
    else current.prev.next = current.next;

    if (current.next == null) tail = current.prev;
    else current.next.prev = current.prev;

    return "REMOVED";
}

public void FORWARD() {
    if (head == null) {
        System.out.println("EMPTY");
        return;
    }
    Node<T> current = head;

    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}

public void BACKWARD() {
    if (tail == null) {
        System.out.println("EMPTY");
        return;
    }
    Node<T> current = tail;

    while (current != null) {
        System.out.print(current.data + " ");
        current = current.prev;
    }
    System.out.println();
}
}
