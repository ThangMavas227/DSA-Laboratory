package Nguyen.Problem12_RecentlyUsedStationCache;
public class DoublyLinkedList {
    private final Node head;
    private final Node tail;
    public DoublyLinkedList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    public void addFirst(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }    
    public void moveToFirst(Node node) {
        remove(node);
        addFirst(node);
    }
    public Node removeLast() {
        if (head.next == tail) {
            return null; 
        }
        Node res = tail.prev;
        remove(res);
        return res;
    }
}
