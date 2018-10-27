import java.util.Scanner;
/**
 * Class for solution.
 * @author: SreeGayathri.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unsed.
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = Integer.parseInt(scan.nextLine());
        LinearProbingHashST<Integer, Student> hash = new LinearProbingHashST<Integer, Student>();
        for(int i = 0; i < data; i++) {
            String[] tokens = scan.nextLine().split(",");
            //System.out.println(tokens);
            hash.put(Integer.parseInt(tokens[0]), new Student(tokens[1], Double.parseDouble(tokens[2])));
        }
        int query = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < query; i++) {
            String[] tokens = scan.nextLine().split(" ");
            Student student = hash.get(Integer.parseInt(tokens[1]));
            if(student == null){
                System.out.println("Student doesn't exists...");
            } else {
                if(tokens[2].equals("1")) {
                    System.out.println(student.getname());
                } else {
                    System.out.println(student.gettotalmarks());
                }
            }
            
        }
    }
}
