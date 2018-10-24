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
    public int deleteFront() {
        if (head != null) {
            int item = head.value;
            head = head.next;
            // size--;
            return item;
        }
        return tail.value;
    }
    public void insertLast(final int value) {
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

    import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            // System.out.println(tokens[0]);
            // System.out.println(tokens[1]);
            int m = Integer.parseInt(tokens[0]);
            // System.out.println(m);
            int n = Integer.parseInt(tokens[1]);
            // System.out.println(n);
            LinkedList deque = new LinkedList();
            String str = "";
            for (int j = 0; j < m; j++) {
                // System.out.println("for loop");
                deque.insertLast(j);
            }
            while (!deque.isEmpty()) {

                // System.out.println("while");
                for (int k = 0; k < n - 1; k++) {
                    deque.insertLast(deque.deleteFront());
                }
                str += deque.deleteFront() + " ";
            }
            System.out.print(str.substring(0, str.length() - 1));
            System.out.println();
        }
    }
}