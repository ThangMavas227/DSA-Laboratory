package common;
import java.util.function.Predicate;


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


        public T getData() {
            return data;
        }
    }


    // a. add node to the end of the list
    public void insertTail (T data){
        Node<T> p = new Node<>(data);
        if (head == null){
            head = tail = p;
        }else{
            tail.next = p;
            tail = p;
        }
    }


    // b. add node to the beginning of the list
    public void insertHead (T data){
        Node<T> p = new Node<>(data);
        if (head == null){
            head = tail = p;
        }else{
            p.next = head;
            head = p;
        }
    }

    public T getHead() {
        return head.data;
    }


    // show list
    public void showList () {
        for (var node = head; node != null; node = node.next) {
            System.out.println(node.data + " -> ");
        }
        System.out.println("null");
    }


    // remove nodes have value x
    public boolean removeNode(T data) {
        Node<T> x = head;
        Node<T> prevX = head;
        while (x != null) {
            if(x.data.equals(data)) {
                break;
            }
            prevX = x;
            x = x.next;
        }
        if(x != null) {
            // xóa x, x là node head
            if(x == head) {
                head = x.next;
                x.next = null;
            } else if(x == tail) { // xóa x, x là node tail
                prevX.next = x.next;
                tail = prevX;
            } else { // xóa x, x là node (head, tail)
                prevX.next = x.next;
                x.next = null;
            }
            return true; // xóa node thành công
        } else {
            return false; // xóa thất bại
        }
    }

    public void removeHead() {
        head = head.next;
    }

    public boolean contain(T data) {
        for (var node = head; node != null; node = node.next){
            if (node.data.equals(data)){
                return true;
            }
        }
        return false;
    }


    public boolean isEmpty () {
        return head == null;
    }
}

