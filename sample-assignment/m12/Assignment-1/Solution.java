<<<<<<< HEAD
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
		Scanner scan = new Scanner(System.in);
		int qualified = scan.nextInt();
		int vacancies = scan.nextInt();
		int unreserved = scan.nextInt();
		int bcvacant = scan.nextInt();
		int scvacant = scan.nextInt();
		int stvacant = scan.nextInt();
		scan.nextLine();
		StringBuffer sb = new StringBuffer();
        int i = 0;
        Filledvacancies fv = new Filledvacancies();
        while (n > 0) {
            n--;
            String[] line = sc.nextLine().split(",");
            String[] temp = line[1].split("-");
            int[] dobInt = new int[3];
            dobInt[0] = Integer.parseInt(temp[2]);
            dobInt[1] = Integer.parseInt(temp[2]);
            dobInt[2] = Integer.parseInt(temp[2]);
            Student s = new Student(line[0],
                                dobInt,
                                Integer.parseInt(line[2]),
                                Integer.parseInt(line[2 + 1]),
                                Integer.parseInt(line[2 + 2]),
                                Integer.parseInt(line[2 + 2 + 1]),
                                line[2 + 2 + 2]);
            fv.addToList(s);
        }
        Selectionsort.sort(fv);
        System.out.println(fv);

	}
=======
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
		Scanner scan = new Scanner(System.in);
		int qualified = scan.nextInt();
		int vacancies = scan.nextInt();
		int unreserved = scan.nextInt();
		int bcvacant = scan.nextInt();
		int scvacant = scan.nextInt();
		int stvacant = scan.nextInt();
		scan.nextLine();
		StringBuffer sb = new StringBuffer();
        int i = 0;
        Filledvacancies fv = new Filledvacancies();
        while (n > 0) {
            n--;
            String[] line = sc.nextLine().split(",");
            String[] temp = line[1].split("-");
            int[] dobInt = new int[3];
            dobInt[0] = Integer.parseInt(temp[2]);
            dobInt[1] = Integer.parseInt(temp[2]);
            dobInt[2] = Integer.parseInt(temp[2]);
            Student s = new Student(line[0],
                                dobInt,
                                Integer.parseInt(line[2]),
                                Integer.parseInt(line[2 + 1]),
                                Integer.parseInt(line[2 + 2]),
                                Integer.parseInt(line[2 + 2 + 1]),
                                line[2 + 2 + 2]);
            fv.addToList(s);
        }
        Selectionsort.sort(fv);
        System.out.println(fv);

	}
>>>>>>> aad999d34dd3fdaa0f6842661f0b26239fbae5fa
}