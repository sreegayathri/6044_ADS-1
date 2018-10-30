/**.
 * imports the Scanner package
 */
import java.util.Scanner;
/**.
 * class for Solution
 */
public final class Solution {
    /**.
     * Constructs the object for solution class
     * @author sreegayathri.
     * 
     */
    private Solution() {

    }
    /**.
     * main method to demonstrate the Binary Search Tree
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                Book book = new Book(tokens[1], tokens[1 + 1],
                                     Double.parseDouble(tokens[2 + 1]));
                bst.put(book, tokens[2 + 2]);
                break;
            case "get":
                book = new Book(tokens[1], tokens[1 + 1],
                                Double.parseDouble(tokens[2 + 1]));
                System.out.println(bst.get(book));
                break;
            default:
                break;
            }
        }

    }
}
