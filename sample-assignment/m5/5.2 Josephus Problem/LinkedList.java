import java.util.Scanner;

class LinkedList {
    private Node head;
    private Node tail;
    private class Node {
        private int value;
        private Node next;

    }
    LinkedList() {
        head = null;
        tail = null;
    }
    public int dequeueFront() {
        if (head != null) {
            int item = head.value;
            head = head.next;
            // size--;
            return item;
        }
        return tail.value;
    }
    public void enqueueLast(final int value) {
        if (tail == null) {
            tail = new Node();
            tail.value = value;
            tail.next = null;
            head = tail;
        } else {
            Node oldTail = tail;
            tail = new Node();
            tail.value = value;
            tail.next = null;
            oldTail.next = tail;
        }
        // size++;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int peek() {
        return head.value;
    }
}