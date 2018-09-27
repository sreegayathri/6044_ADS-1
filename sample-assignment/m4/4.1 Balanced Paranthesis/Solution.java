import java.util.Scanner;
/**.
 * the main class for checking
 * balanced parenthesis
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * main function takes input fro console
     * checks the given input is balanced or not.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        BalancedParenthesis obj = new BalancedParenthesis();
        for (int i = 0; i < lines; i++) {
            input = scan.next();
            obj.add(input);
            System.out.println(obj.isEmpty());

        }

    }
}
/**.
 * Class for check given method is
 * balanced parenthesis.
 */
class BalancedParenthesis {
    /**.
     * size of the stack array
     */
    private int size = 0;
    /**.
     * store the open braces
     */
    private String[] stack;
    /**.
     * store the input item
     */
    private String[] item;
    /**.
     * this method is to add inputs
     * and perform stack operations on it.
     *
     * @param      input  The input
     */
    public void add(final String input) {
        int len = input.length();
        stack = new String[len];
        item = input.split("");
        for (int i = 0; i < item.length; i++) {
            // char a = item.charAt(i);
            if (item[i].equals(
                        "(") || item[i].equals(
                        "[") || item[i].equals("{")) {
                push(item[i]);
            } else if (item[i].equals(
                           ")") || item[i].equals(
                           "]") || item[i].equals("}")) {
                if (size != 0) {
                    if (item[i].equals(")") && (
                                stack[size - 1].equals(
                                    "("))) {
                        pop();

                    } else if (item[i].equals("]") && (
                                   stack[size - 1].equals(
                                       "["))) {
                        pop();
                    } else if (item[i].equals("}") && (
                                   stack[size - 1].equals(
                                       "{"))) {
                        pop();
                    }
                }
            }
        }
    }
    /**.
     * this method adds the element into stack
     *
     * @param      element  The element
     */
    public void push(final String element) {
        stack[size++] = element;
    }
    /**.
     * this method to delete element
     */
    public void pop() {
        size--;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public String isEmpty() {
        if (size == 0) {
            return "YES";
        }
        return "NO";
    }

}