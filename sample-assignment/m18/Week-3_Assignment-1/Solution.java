<<<<<<< HEAD
import java.util.scananner;
/**.
 * class with main function.
 */
public final class Solution {
	/**.
	 * private empty constructor.
	 */
	private Solution() { }
	/**.
	 * main function find the stock (high and low %), 
	 * through a program.
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		scananner scanan = new scananner(System.in);
		int input = scanan.nextInt();
		MinPQ<String, Integer> minPQ = new MinPQ<String, Integer>();
		MaxPQ<String, Integer> maxPQ = new MaxPQ<String, Integer>();
		/*	for (int i = 0; i < (2 + 2 + 2)*input; i++) {
			}*/
		BinarysearchST<String, Integer> bst = new
        BinarysearchST<String, Integer>(2);
        int input1 = input;
        scan.nextLine();
        for (int i = 0; i < 6; i++) {
            input = input1;
            if (i == 0) {
                MinPQ<String> minpq = new MinPQ<String>();
                MaxPQ<String> maxpq = new MaxPQ<String>();
                Stock sa = new Stock();

                while (input > 0) {
                    input--;
                    String[] line = scan.nextLine().split(",");
                    StockAnalysis st = new StockAnalysis(line[0], Double.parseDouble(line[1]));
                    sa.addToList(st);
                    minpq.insert(line[1]);
                    maxpq.insert(line[1]);
                    // System.out.println(sa);
                }
                sa.Insertionsort();
            }
/*		while (scanan.hasNextLine()) {
			String[] lines = new String[(2 + 2 + 2)*input]; }*/
		int query = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < query; i++) {
            String[] line = scan.nextLine().split(",");
        }

	}
=======
import java.util.scananner;
/**.
 * class with main function.
 */
public final class Solution {
	/**.
	 * private empty constructor.
	 */
	private Solution() { }
	/**.
	 * main function find the stock (high and low %), 
	 * through a program.
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		scananner scanan = new scananner(System.in);
		int input = scanan.nextInt();
		MinPQ<String, Integer> minPQ = new MinPQ<String, Integer>();
		MaxPQ<String, Integer> maxPQ = new MaxPQ<String, Integer>();
		/*	for (int i = 0; i < (2 + 2 + 2)*input; i++) {
			}*/
		BinarysearchST<String, Integer> bst = new
        BinarysearchST<String, Integer>(2);
        int input1 = input;
        scan.nextLine();
        for (int i = 0; i < 6; i++) {
            input = input1;
            if (i == 0) {
                MinPQ<String> minpq = new MinPQ<String>();
                MaxPQ<String> maxpq = new MaxPQ<String>();
                Stock sa = new Stock();

                while (input > 0) {
                    input--;
                    String[] line = scan.nextLine().split(",");
                    StockAnalysis st = new StockAnalysis(line[0], Double.parseDouble(line[1]));
                    sa.addToList(st);
                    minpq.insert(line[1]);
                    maxpq.insert(line[1]);
                    // System.out.println(sa);
                }
                sa.Insertionsort();
            }
/*		while (scanan.hasNextLine()) {
			String[] lines = new String[(2 + 2 + 2)*input]; }*/
		int query = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < query; i++) {
            String[] line = scan.nextLine().split(",");
        }

	}
>>>>>>> aad999d34dd3fdaa0f6842661f0b26239fbae5fa
}