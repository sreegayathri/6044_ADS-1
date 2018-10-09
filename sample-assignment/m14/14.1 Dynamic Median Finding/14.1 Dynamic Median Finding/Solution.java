/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object. for Solution class
     */
    private Solution() {

    }
    /**.
     * main function
     *@author Teja
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        MinPQ<Float> minpq = new MinPQ<Float>(n);
        MaxPQ<Float> maxpq = new MaxPQ<Float>(n);
        float median = 0.0f;
        for (int i = 0; i < n; i++) {
            float tok = scan.nextFloat();
            if (tok > median) {
                minpq.insert(tok);
            } else {
                maxpq.insert(tok);
            }
            if (maxpq.size() - minpq.size() > 1) {
                float data = maxpq.delMax();
                minpq.insert(data);
            }
            if (minpq.size() - maxpq.size() > 1) {
                float in = minpq.delMin();
                maxpq.insert(in);
            }
            if (minpq.size() == maxpq.size()) {
                median = (minpq.min() + maxpq.max()) / 2;
                System.out.println(median);
            }
            if (maxpq.size() > minpq.size()) {
                median = maxpq.max();
                System.out.println(median);
            }
            if (minpq.size() > maxpq.size()) {
                median = minpq.min();
                System.out.println(median);
            }

        }
    }
}
