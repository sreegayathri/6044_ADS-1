import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * { function_description }
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
// Solution nop = new Solution();
		Scanner scan = new Scanner(System.in);
		/*		int line = scan.nextLine();*/
		int n = scan.nextInt();
		int[] ThreeSum = new int[n];
		for (int i = 0; i < ThreeSum.length; i++) {
//System.out.println(" number");
			ThreeSum[i] = scan.nextInt();
		}// n
		int l, r, count = 0;
		Arrays.sort(ThreeSum);//nlogn
		for (int i = 0; i < n - 2; i++) {
			l = i + 1;
			r = n - 1; // index of the last element
			while (l < r) {
				if (ThreeSum[i] + ThreeSum[l] + ThreeSum[r] == 0) {
					count++;
					l++;
					r--;
				} else if (ThreeSum[i] + ThreeSum[l] + ThreeSum[r] < 0) {
					l++;
				} else {
					r--;
				}
			}
		}
		System.out.println(count);

	}
}