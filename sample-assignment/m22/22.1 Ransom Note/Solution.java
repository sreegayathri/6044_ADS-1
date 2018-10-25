import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String[] magazine = sc.nextLine().split(" ");
        SeparateChainingHashST<String, Integer> h =
            new SeparateChainingHashST<>();
        for (int i = 0; i < m; i++) {
            if (h.contains(magazine[i])) {
                h.put(magazine[i], h.get(magazine[i]) + 1);
            } else {
                h.put(magazine[i], 1);
            }
        }
        String[] note = sc.nextLine().split(" ");
        for (int j = 0; j < n; j++) {
            if (h.contains(note[j])) {
                if (h.get(note[j]) == 0) {
                    System.out.println("No");
                    return;
                } else {
                    h.put(note[j], h.get(note[j]) - 1);
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
