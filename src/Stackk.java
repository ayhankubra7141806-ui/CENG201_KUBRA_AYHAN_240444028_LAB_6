public class Stackk {
    private Node top;
    public Stackk() {
        top = null;
    }
    //adding
    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    //deleting
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next;
        return value;
    }
    //finding biggest number (top)
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }
    //controlling if it is empty
    public boolean isEmpty() {
        return top == null;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        //traverse
        Node current = top;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}