import java.util.Scanner;
import java.util.Arrays;
class Solution {
	Solution() {}
	public static void main(final String[] args) {
		// Solution nop = new Solution();
		Scanner scan = new Scanner(System.in);
/*		int line = scan.nextLine();*/
		int[] NumberOfPairs = new int[5];
	    for (int i = 0; i < NumberOfPairs.length; i++) {
	        //System.out.println(" number");
	        NumberOfPairs[i] = scan.nextInt();
	    }// n
	    Arrays.sort(NumberOfPairs);//nlogn
	    int lookup = 1;
	    int count = 0;
	    
	    for (int j = 0; j < NumberOfPairs.length-1; j++) {//n
	    	if (NumberOfPairs[j] == NumberOfPairs[j+1]) {
	        	lookup += 1;
	        	//System.out.println("lookup is " +lookup);
	        } else {
	        	count += (lookup*(lookup - 1))/2;
	        	lookup = 1;
	        	//System.out.println("count is " +count);
	        } 
	    }
	    count += (lookup*(lookup - 1))/2;
	    System.out.println(count);
	}
	        
}