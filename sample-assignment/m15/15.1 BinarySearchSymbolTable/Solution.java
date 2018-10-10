import java.util.Scanner;
public class Solution{
    Solution() {}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        BinarySearchST<String, Integer> st = new BinarySearchST<String, Integer>(input.length);
        for (int i = 0; i < input.length; i++) {
            st.put(input[i], i);
        }
        while (scan.hasNextLine()) {
            String[] operation = scan.nextLine().split(" ");
            switch (operation[0]) {
                case "contains":
                System.out.println(st.contains(operation[1]));
                break;
            case "get":
                System.out.println(st.get(operation[1]));
                break;
            case "max":
                System.out.println(st.max());
                break;
            case "floor":
                System.out.println(st.floor(operation[1]));
                break;
            case "rank":
                System.out.println(st.rank(operation[1]));
                break;
            case "deleteMin":
                st.deleteMin();
                break;
            case "keys":
                st.keys();
                break;
            default:
                break;
            }
        }
    }
}