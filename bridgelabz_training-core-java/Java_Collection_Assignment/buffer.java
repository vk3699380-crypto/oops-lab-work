package Bridgelabz.Java_Collection_Assignment;
class CircularBuffer {
    int[] arr;
    int front = 0, size = 0, capacity;
    CircularBuffer(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }
    public void add(int x) {
        int idx = (front + size) % capacity;
        if (size == capacity) {
            front = (front + 1) % capacity; // overwrite
        } else {
            size++;
        }
        arr[idx] = x;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        cb.print();
    }
}

