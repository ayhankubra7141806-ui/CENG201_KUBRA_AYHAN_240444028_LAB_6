public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];
        top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        items[top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        char removedChar = items[top];
        top--;
        return removedChar;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
}