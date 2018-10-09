/**.
 * impors scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 *
 */
public final class Solution  {
    /**.
     * Constructs the object for Solution
     * @author sreegayathri
     */
    private Solution() {

    }
    /**.
     * main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        switch (key) {
        case "String":
            while (n > 0) {
                String[] tokens = scan.nextLine().split(",");
                MinPQ<String> item = new MinPQ<String>(tokens);
                System.out.println(item.isMinPQ());
                n--;
            }
            break;
        case "Integer":
            while (n > 0) {
                String[] tokens = scan.nextLine().split(",");
                Integer[] integerarray = new Integer[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    integerarray[i] = Integer.parseInt(tokens[i]);
                }
                MinPQ<Integer> item = new MinPQ<Integer>(integerarray);
                System.out.println(item.isMinPQ());
                n--;
            }
            break;
        case "Float" :
            while (n > 0) {
                if (key.equals("")) {
                    System.out.println("false");
                    break;
                }
                String[] tokens = scan.nextLine().split(",");
                Float[] floatarray = new Float[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    floatarray[i] = Float.parseFloat(tokens[i]);
                }
                MinPQ<Float> item = new MinPQ<Float>(floatarray);
                System.out.println(item.isMinPQ());
                n--;
            }
            break;
        case "Double" :
            while (n > 0) {
                String[] tokens  = scan.nextLine().split(",");
                Double[] doublearray = new Double[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    doublearray[i] = Double.parseDouble(tokens[i]);
                }
                MinPQ<Double> item = new MinPQ<Double>(doublearray);
                System.out.println(item.isMinPQ());
                n--;
            }
            break;
            default:
            break;
        }
    }
}
