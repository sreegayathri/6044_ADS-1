import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }.
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
// Solution nop = new Solution();
        Scanner scan = new Scanner(System.in);
        /*      int line = scan.nextLine();*/
        int n = scan.nextInt();
        int[] threeSum = new int[n];
        for (int i = 0; i < threeSum.length; i++) {
//System.out.println(" number");
            threeSum[i] = scan.nextInt();
        } // n
        int l, r, count = 0;
        Arrays.sort(threeSum); //nlogn
        for (int i = 0; i < n - 2; i++) {
            l = i + 1;
            r = n - 1; // index of the last element
            while (l < r) {
                if (threeSum[i] + threeSum[l] + threeSum[r] == 0) {
                    count++;
                    l++;
                    r--;
                } else if (threeSum[i] + threeSum[l] + threeSum[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        System.out.println(count);

    }
}