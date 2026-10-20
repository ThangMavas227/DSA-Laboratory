package Problem4_BoardingCircularQueue;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int size;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public void enqueue(int x) {
        int index = (front + size) % arr.length;
        arr[index] = x;
        size++;
    }

    public int dequeue() {
        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return value;
    }

    public int peek() {
        return arr[front];
    }
}