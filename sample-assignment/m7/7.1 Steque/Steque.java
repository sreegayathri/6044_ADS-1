/**
 * Class for steque.
 */
class Steque {
    /**
     * { Nodes front and rear }.
     */
    private Node front, rear;
    /**
     * size.
     */
    private int size;
/**
 * Constructs the object.
 */
    public Steque() {
        front = null;
        rear = null;
        size = 0;
    }
/**
 * Determines if empty.
 *
 * @return     True if empty, False otherwise.
 */
    public boolean isEmpty() {
        return (front == null);
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     * Pushes at left.
     * Best case: O(1)
     * Worst case: O(1)
     * average case: O(1)
     *
     * @param      data  The data
     */
    public void push(final int data) {
        Node npointer = new Node(data, null);
        size++;
        if (front == null) {
            front = npointer;
            rear = front;
        } else {
            npointer.setLink(front);
            front = npointer;
        }
    }
    /**
     * Pushes at right.
     * Best case: O(1)
     * Worst case: O(1)
     * average case: O(1)
     * @param      data  The data
     */
    public void enqueue(final int data) {
        Node npointer = new Node(data, null);
        size++;
        if (rear == null) {
            rear = npointer;
            front = rear;
        } else {
            rear.setLink(npointer);
            rear = npointer;
        }
    }
    /**.
     * pops left.
     * Best case: O(1)
     * Worst case: O(1)
     * average case: O(1)
     * @return     { description_of_the_return_value }
     */
    public int pop() {
        if (!isEmpty()) {
            Node pointer = front;
            front = pointer.getLink();
            if (front == null) {
                rear = null;
            }
            size--;
            return pointer.getData();
        }
        return -1;

    }
    /**
     * prints.
     * Best case: O(1)
     * Worst case: O(n)
     * average case: O(n)
     */

    public void show() {
        if (front != null) {
            String s = "";
            Node pointer = front;
            while (pointer != rear.getLink()) {
                s += pointer.getData() + ", ";
                pointer = pointer.getLink();
            }
            s = s.substring(0, s.length() - 2);
            System.out.println(s);
        } else {
            System.out.println("Steque is empty.");
        }
    }
}