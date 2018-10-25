import java.util.Scanner;
class Solution {
	Solution() { }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		String[] magazine = sc.nextLine().split(" ");
		SeparateChainingHashST<String, Integer> h = new SeparateChainingHashST<>();
		for (int i = 0; i < m; i++) {
			if (h.contains(magazine[i])) {
				h.put(magazine[i], h.get(magazine[i]) + 1);
			} else {
				h.put(magazine[i], 1);
			}
		}
		String[] note = sc.nextLine().split(" ");
		boolean flag = true;
		for (int j = 0; j < n; j++) {
			if (h.contains(note[j])) {
				if (h.get(note[j]) == 0) {
					System.out.println("No");
					flag = false;
					return;
				} else {
					h.put(note[j], h.get(note[j]) - 1);
				}
			}
			if (flag) {
				System.out.println("Yes");
			}
		}

	}
}
