/**
 * Class for steque.
 */
class Steque {
    /**
     * { Nodes front and rear }.
     */
    protected Node front, rear;
    /**
     * size.
     */
    public int size;
/**
 * Constructs the object.
 */
    public Steque() {
        front = null;
        rear = null;
        size = 0;
    }
    /**.  
     * Function to check if queue is empty 
    */
    public boolean isEmpty() {
        return (front == null);
    }
    /**.  Function to get the size of the queue */
    public int size() {
        return size;
    }

    public void push(int data) {
        Node npointer = new Node(data, null);
        size++ ;
        if (front == null) {
            front = npointer;
            rear = front;
        } else {
            npointer.setLink(front);
            front = npointer;
        }
    }
    public void enqueue(int data) {
        Node npointer = new Node(data, null);
        size++ ;
        if (rear == null) {
            rear = npointer;
            front = rear;
        } else {
            rear.setLink(npointer);
            rear = npointer;
        }
    }
    public int pop() {
        if (!isEmpty()) {
            Node pointer = front;
            front = pointer.getLink();
            if (front == null) {
                rear = null;
            }
            size-- ;
            return pointer.getData();
        } return -1;

    }
    public void show() {
        if (front != null) {
            String s = "";
            Node pointer = front;
            while (pointer != rear.getLink() ) {
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