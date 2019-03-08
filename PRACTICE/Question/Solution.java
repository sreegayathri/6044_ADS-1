// import java.util.HashMap; 
// import java.util.Map;
import java.util.Scanner;
import java.lang.Comparable;

class Student implements Comparable<Student> {
	int id;
	String name;
	String degree;
	Double percent;

	Student(int id, String name, String degree, Double percent) {
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.percent = percent;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return this.degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Double getPercent() {
		return this.percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}
	public int compareTo(final Student that) {

        if (this.getPercent() > that.getPercent()) {
            return 1;
        } else if (this.getPercent() < that.getPercent()) {
            return -1;
        } else if (this.getId() > that.getId()) {
            return -1;
        } else {
            return 1;
        }
    }
	public String toString() {
		return this.id + "," + this.name + "," + this.degree + "," + this.percent;
	}
}

public class Solution{
	Solution() {
		//
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		Student st;
		MaxPQ<Student> maxpq = new MaxPQ<Student>();
		// MinPQ<Student> minpq = new MinPQ<Student>();
		while(scan.hasNext()) {
			String data = scan.nextLine();
			String[] tok = data.split(" ");
			switch (tok[0]) {
				case "Apply":
				String[] token = tok[1].split(",");
				st = new Student(Integer.parseInt(token[0]), token[1], token[2], Double.parseDouble(token[2 + 1]));
				maxpq.insert(st);
				break;
				// System.out.println(maxpq.delMax());
				case "Recruit_Top_Candidate":
				System.out.println(maxpq.delMax());
				case "Ranking":
				// String[] token1 = tok[1].split(",");
				// st = new Student(Integer.parseInt(token1[0]), token1[1], token1[2], Double.parseDouble(token1[2 + 1]));
				// maxpq.insert(st);
				// System.out.println((maxpq.pq.size()));

				for (int x = n; x < maxpq.size(); x++) {
					int j = 1;
					System.out.println(j + ": " + maxpq.delMax());
				}
				default:
				break;
			}
			
		}
		// HashMap<Integer, Student> map = new HashMap<>();
		// Student[] list;
		// Student[] recruted;
		// Student[] otherRanked;
		// while (i < n) {
		// 	while(!("Recruit_Top_Candidate").equals(scan.hasNext())) {
		// 		list[i++] = new Student(Integer.parseInt(token[0]), token[1], token[2], Double.parseDouble(token[2 + 1]));
		// 		// map.put(list);
		// 	}
		// 	maxpq.insert(list);
		// 	recruted[i++] = maxpq.delMax();

		// 	i++;
		// }
		// for(int i =0; i < recruted.length; i++) {
		// 	System.out.println(recruted[i]);
		// }
	}
}