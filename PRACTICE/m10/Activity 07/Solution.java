/**
 * Class for solution.
 */
public class Solution {
	/**
	 * {main funciton}.
	 */
	public static int count = 0;
	public static void main(String[] args) {
		System.out.println(fact(10));
		System.out.println(count + "count");
	}
	public static int fact(int num) { // complexity is N.
		if (num == 1) {
			count++;
			return 1;
		}
		count++;
		return num * fact(num - 1);
	}
}