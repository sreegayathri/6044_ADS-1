import java.util.Scanner;
import java.util.Arrays;
class Solution {
	Solution() {}
	public static void main(final String[] args) {
		// Solution nop = new Solution();
		Scanner scan = new Scanner(System.in);
/*		int line = scan.nextLine();*/
		int n = scan.nextInt();
		int[] NumberOfPairs = new int[n];
	    for (int i = 0; i < NumberOfPairs.length; i++) {
	        //System.out.println(" number");
	        NumberOfPairs[i] = scan.nextInt();
	    }// n
	    int l,r,count = 0;
	    Arrays.sort(NumberOfPairs);//nlogn
	    for (int i = 0; i < n - 2; i++) {
 
            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = n - 1; // index of the last element
            while (l < r) {
                if (NumberOfPairs[i] + NumberOfPairs[l] + NumberOfPairs[r] == 0) {
                	count++;
                	l++;
                	r--;
                }
                else if (NumberOfPairs[i] + NumberOfPairs[l] + NumberOfPairs[r] < 0)
                    l++;
 
                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }
        System.out.println(count);
	        
	}
}