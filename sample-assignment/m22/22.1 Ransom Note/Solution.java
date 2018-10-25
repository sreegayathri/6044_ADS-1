import java.util.Scanner;
class Solution {
	Solution() { }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		String[] magazine = sc.nextLine().split(" ");
		String[] note = sc.nextLine().split(" ");
		RansomNote h = new RansomNote();
		for (int i = 0; i < m; i++) {
			h.put(magazine[i], 1);
		}
		boolean flag = true;
		for (int j = 0; j < n; j++) {
			if (h.get(magazine[j]) != h.get(note[j])) {
				flag = false;
				System.out.println("No");
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		}
	}

}
