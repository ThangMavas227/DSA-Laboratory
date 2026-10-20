package Problem1_CargoScanStack;

public class IntStack {
    private int[] arr;
    private int size;

    public IntStack() {
        arr = new int[2];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(int x) {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = x;
        size++;
    }

    public int pop() {
        int value = arr[size - 1];
        size--;
        return value;
    }

    public int peek() {
        return arr[size - 1];
    }
}