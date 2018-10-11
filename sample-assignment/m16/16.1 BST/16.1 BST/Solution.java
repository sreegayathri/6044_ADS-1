import java.util.Scanner;
/**.
 * solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //function.
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (scan.hasNextLine()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                bst.put(new Book(tokens[1], tokens[2],
                 Double.parseDouble(tokens[2 + 1])),
                  Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                System.out.println(bst.get(new Book(tokens[1],
                 tokens[2], Double.parseDouble(tokens[2 + 1]))));
                break;
            default:
                break;
            }
        }
    }
}