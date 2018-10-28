import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the h.
     */
    private Solution() { }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinearProbingHashST<String, Integer> h = new
            LinearProbingHashST<String, Integer>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
                case "put":
                    h.put(tokens[1], Integer.parseInt(tokens[2]));
                    break;
                case "get":
                    System.out.println(h.get(tokens[1]));
                    break;
                case "delete":
                    h.delete(tokens[1]);
                    break;
                case "display":
                    h.display();
                    break;
                default:
                break;
            }
        }
    }
}
