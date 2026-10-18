package Thang.Problem10_LinkedQueue;


public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    static class Node<T> {
        private T data;
        private Node<T> next;

        public Node (T data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(T data){
        Node<T> p = new Node<>(data);
        if (head == null){
            head = tail = p;
        }else{
            tail.next = p;
            tail = p;
        }
    }

    public T peek() {
        return head.data;
    }

    public T dequeue() {
        if (head == null) return null;
        T tmp = head.data;
        head = head.next;
        if (head == null) tail = null;
        return tmp;
    }

}

