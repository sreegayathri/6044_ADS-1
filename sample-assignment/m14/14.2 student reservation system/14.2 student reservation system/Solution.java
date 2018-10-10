import java.util.*;
/**
 * { item_description }
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int o = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        int q = Integer.parseInt(sc.nextLine());
        int r = Integer.parseInt(sc.nextLine());
        int s = Integer.parseInt(sc.nextLine());
        Student[] list = new Student[n];
        int temp = n;
        int i = 0;
        while (n > 0) {
            String[] tokens = sc.next().split(",");
            list[i++] = new Student(tokens[0], tokens[1], Integer.parseInt(tokens[2]),
            Integer.parseInt(tokens[2 + 1]), Integer.parseInt(tokens[2 + 2]),
            Integer.parseInt(tokens[2 + 2 + 1]), tokens[2 + 2 + 2]);
            n--;
        }
        Heap h = new Heap();
        h.sort(list);
        for (int j = 0; j < temp; j++) {
            System.out.println(list[j]);
        }
    }
}