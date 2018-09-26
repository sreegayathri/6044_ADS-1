import java.util.*;
/**.
 * { item_description }.
 */
public final class Solution {
	/**.
	 * Constructs the object.
	 */
	Solution() {

	}
	/**.
	 * { function_description }.
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
        /*      int line = scan.nextLine();*/
        int sizefirst = scan.nextInt();
        int sizetwo = scan.nextInt();
        int[] firstArray = new int[sizefirst];
        int[] twoArray = new int[sizetwo];
        scan.nextLine();
        String[] arr1 = scan.nextLine().split(",");
        String[] arr2 = scan.nextLine().split(",");
        /*System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));*/
        for (int i = 0; i < firstArray.length; i++) {
		//System.out.println(" number");
            firstArray[i] = Integer.parseInt(arr1[i]);
        } // n
        for (int j = 0; j < twoArray.length; j++) {
		//System.out.println(" number");
            twoArray[j] = Integer.parseInt(arr2[j]);
        } // n

        int size = sizefirst + sizetwo;
        int[] finalarray = new int[size];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < firstArray.length && j < twoArray.length) {
	        if (firstArray[i] < twoArray[j]) {
	        	finalarray[index] = firstArray[i];
	        	i++;
	        } else {
	        	finalarray[index] = twoArray[j];
	        	j++;
	        }
        }
        while(i < firstArray.length) {
	        // if (fibrstArray[i] < twoArray[j]) {
	        	finalarray[index] = firstArray[i];
	        	i++;
	        // } 
        }
	    while (j < twoArray.length) {
	    	// if (firstArray[i] > twoArray[j]) {
	    		finalarray[index] = twoArray[j];
	    		j++;
	    	// }
	    }
	    System.out.println(Arrays.toString(finalarray));
	}
}