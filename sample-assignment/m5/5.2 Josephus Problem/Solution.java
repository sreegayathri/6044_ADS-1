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
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            int p = Integer.parseInt(tokens[0]);
            int q = Integer.parseInt(tokens[1]);
            LinkedList dq = new LinkedList();
            String str = "";
            for (int j = 0; j < p; j++) {
                dq.enqueueLast(j);
            }
            while (!dq.isEmpty()) {

                for (int i = 0; i < q - 1; i++) {
                    dq.enqueueLast(dq.dequeueFront());
                }
                str += dq.dequeueFront() + " ";
            }
            System.out.print(str.substring(0, str.length() - 1));
            System.out.println();
        }
    }
}