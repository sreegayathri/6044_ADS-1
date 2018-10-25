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
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (h.get(note[i]) != h.get(note[i])) {
				flag = true;
				System.out.println("No");
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		}
	}

}
