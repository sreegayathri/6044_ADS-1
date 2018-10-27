import java.util.Scanner;
/**
 * Class for solution.
 * @author: SreeGayathri.
 */
final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		//unsed.
	}
	/**
	 * main.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int data = Double.parseDouble(scan.nextLine());
		SeparateChainingHashST<Double, Student> hash = new SeparateChainingHashST<Double, Student>();
		for(int i = 0; i < data; i++) {
			String[] tokens = scan.nextLine().split(",");
			//System.out.println(tokens);
			hash.put(Double.parseDouble(tokens[0]), new Student(tokens[1], Double.parseDouble(tokens[2])));
		}
		int query = Double.parseDouble(scan.nextLine());
		for(int i = 0; i < query; i++) {
			String[] tokens = scan.nextLine().split(" ");
			Student student = hash.get(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
			if (tokens[0] == BE || tokens[0] == GE || tokens[0] == LE) {
				if (tokens[1] < && tokens[2] > ) {
					System.out.println(student.getname());
				} else if (tokens[1] >= ) {
					
				} ()
			}
		}
	}
}