/**
 * Queue.java
 * Your Name:  Kübra Ayhan
 * Your Student ID:240444028
 */
public class Queue<T> {
    private T[] items;
    private int front;
    private int rear;
    private int count;
    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        items = (T[]) new Object[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(T value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear++;
        items[rear] = value;
        count++;
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removedValue = items[front];
        items[front] = null; // Clear reference for garbage collection
        front++;
        count--;
        return removedValue;
    }
    public T peek() {
        // TODO: Check whether the queue is empty.
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // TODO: Return the front element without removing it.
        return items[front];
    }

    public boolean isEmpty() {
        // TODO: Check whether count is zero.
        return count == 0;
    }

    public boolean isFull() {
        // TODO: Check whether count equals the array capacity.
        return count == items.length;
    }

    public int size() {
        // TODO: Return the number of elements.
        return count;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {

            int index = front + i;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }
        result.append("]");

        return result.toString();
    }

}
