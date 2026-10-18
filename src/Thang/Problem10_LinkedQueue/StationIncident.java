package Thang.Problem10_LinkedQueue;

public class StationIncident<T> {
    private SinglyLinkedList<T> data;
    private int size;

    public StationIncident () {
        this.data = new SinglyLinkedList<>();
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void ENQ(T e) {
        data.enqueue(e);
        size++;
    }

    public T SERVE() {
        if (!isEmpty()) size--;
        return data.dequeue();
    }

    public T FRONT() {
        return isEmpty() ? null : data.peek();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
