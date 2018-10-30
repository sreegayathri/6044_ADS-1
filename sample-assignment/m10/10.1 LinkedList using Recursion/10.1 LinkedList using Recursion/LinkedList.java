/**.
 * List of linkeds.
 */
public class LinkedList {
    /**.
    * head;
    */
    private Node head;
    /**.
     * Class for node.
     */
    private class Node {
        /**.
         * data.
         */
        private int data;
        /**.
         * next.
         */
        private Node next;
        /**.
         * Constructs the object.
         * @param      data  The data
         * @param      next  The next
         */
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    /**.
     * insertAt.
     * time complexity of this method is 1
     * because the function is called only at once.
     * @param      position  The position
     * @param      data      The data
     * @return     { description_of_the_return_value }
     */
    public boolean insertAt(int position, int data) {
        boolean flag = false;
        try {
            head = insertHelper(head, position , data);
        } catch (Exception e) {
            System.out.println("Can't insert at this position.");
            flag = true;
        }
        return flag;
    }
    /**
     * insertHelper.
 	 * The time complexity of this method is N because it is
     * recursive and called N times.
     * @param      head  The head
     * @param      count   The count
     * @param      element   The element
     * @return     { description_of_the_return_value }
     */
    public Node insertHelper(Node head, int count, int element) {
        if (count == 0) return new Node(element, head);
        head.next = insertHelper(head.next, count - 1, element);
        return head;
    }
    /**
     * reverse.
     * The time complexity is constant because the method is called only once
     */
    public void reverse() {
        head = reverseHelper(head);
    }
    /**
    * reverseHelper.
    * { this is overloaded method of the above reverse method }
	* time complexity is N because it is an recursive method that can be called N times.
     * @param      head  The head
     *
     * @return     { description_of_the_return_value }
     */
    Node reverseHelper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nhead = reverseHelper(head.next);
        head.next.next = head;
        head.next = null;
        return nhead;
    }
    /**
     * print.
     *
     * @return String representation of the object.
     */
    public String print() {
        Node thead = head;
        String s  = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.next;
        }

        return s.substring(0 , s.length() - 2);
    }
}