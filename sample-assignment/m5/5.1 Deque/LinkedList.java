/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * List of linked lists.
 */
class LinkedList {
    /**.
     * { var_description }
     */
    private Node start;
    /**.
     * { var_description }
     */
    private Node end;
    /**.
     * { var_description }
     */
    private int size= 0;
    /**.
     * Class for node.
     */
    private class Node {
        /**.
         * { var_description }
         */
        private int value;
        /**.
         * { var_description }
         */
        private Node next;
    }
    /**.
     * Constructs the object.
     */
    LinkedList() {
        start = null;
        end = null;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public void deleteFront() {
        if (start != null) {
            start = start.next;
            size--;
        }
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public void deleteBack() {
        if (end != null) {
            Node temp = null;
            Node popped = end;
            Node element = start;
            while (element != end) {
                temp = element;
                element = element.next;
            }
            end = temp;
            end.next = null;
            size--;
        }

    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public void insertBack(final int value) {
        if (end == null) {
            end = new Node();
            end.value = value;
            end.next = null;
            start = end;
        } else {
            Node oldend = end;
            end = new Node();
            end.value = value;
            end.next = null;
            oldend.next = end;
        }
        size++;
    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public void insertFront(final int value) {
        if (start == null) {
            start = new Node();
            start.value = value;
            start.next = null;
            end = start;
        } else {
            Node oldstart = start;
            start = new Node();
            start.value = value;
            start.next = oldstart;
        }
        size++;
    }
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return start == null;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int peek() {
        return start.value;
    }
    public int size() {
        return size;
    }
    public String displayAll() {
        if (size != 0) {
            String str = "[";
            Node temp = start;
            while (temp != null) {
                str += temp.value + ", ";
                temp = temp.next;
            }
            return str.substring(0, str.length() - 2) + "]";
        }
        return "[]";
    }
}