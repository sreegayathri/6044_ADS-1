import java.util.Scanner;

final class Solution {
    private Solution() {}
    public static void main(final String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        BalancedParenthesis obj = new BalancedParenthesis();
        for (int i = 0; i < lines; i++) {
            input = scan.next();
            obj.add(input);
            System.out.println(obj.isEmpty());
        }
    }
}
class BalancedParenthesis {
    private int size = 0;
    private String[] stack;
    private String[] item;
    public void add(final String input) {
        int len = input.length();
        stack = new String[len];
        item = input.split("");
        for (int i = 0; i < item.length; i++) {
            if (item[i].equals("(") || item[i].equals("[") || item[i].equals("{")) {
                push(item[i]);
            } else if (item[i].equals(")") || item[i].equals("]") || item[i].equals("}")) {
                if (size != 0) {
                    if (item[i].equals(")") && (stack[size - 1].equals("("))) {
                        pop();
                    } else if (item[i].equals("]") && (stack[size - 1].equals("["))) {
                        pop();
                    } else if (item[i].equals("}") && (stack[size - 1].equals("{"))) {
                        pop();
                    }
                }
            }
        }
    }
    public void push(final String element) {
        stack[size++]=element;
    }
    public void pop() {
        size --;
    }
    public String isEmpty() {
        if (size==0) {
            return "YES";
        }
        return "NO";
    }

}