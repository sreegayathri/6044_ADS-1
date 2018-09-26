import java.util.Scanner;
public final class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        /*      int line = scan.nextLine();*/
        int sizefirst = scan.nextInt();
        int sizetwo = scan.nextInt();
        int[] firstArray = new int[sizefirst];
        int[] twoArray = new int[sizetwo];
        scan.nextLine();
        for (int i = 0; i < firstArray.length; i++) {
//System.out.println(" number");
            firstArray[i] = scan.nextInt();
        } // n
        for (int i = 0; i < twoArray.length; i++) {
//System.out.println(" number");
            twoArray[i] = scan.nextInt();
        } // n
	}
}