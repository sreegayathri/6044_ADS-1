/**.
 * Class for student.
 */
public class Student implements Comparable<Student> {
	private String studentname;
	private String dob;
	private int sub1marks;
	private int sub2marks;
	private int sub3marks;
	private int totalmarks;
	private String reservation;
	/**.
	 * Constructs the object.
	 * @param      studentname  The studentname
	 * @param      dob          The dob
	 * @param      sub1marks    The sub 1 marks
	 * @param      sub2marks    The sub 2 marks
	 * @param      sub3marks    The sub 3 marks
	 * @param      totalmarks   The totalmarks
	 * @param      reservation  The reservation
	 */
	Student(String studentname, String dob, int sub1marks, int sub2marks, int sub3marks,
					int totalmarks, String reservation) {
		this.studentname = studentname;
		this.dob = dob;
		this.sub1marks = sub1marks;
		this.sub2marks = sub2marks;
		this.sub3marks = sub3marks;
		this.totalmarks = totalmarks;
		this.reservation = reservation;
	}

	/**.
	 * gets the name.
	 * @param      studentname  The studentname
	 * @return     { description_of_the_return_value }
	 */
	public String getName() {
		return this.studentname;
	}
	/**.
	 * { function_description }
	 * @param      dob   The dob
	 * @return     { description_of_the_return_value }
	 */
	public String getDob(){
		return this.dob;
	}
	/**.
	 * gets the subone.
	 * @param      sub1marks  The sub 1 marks
	 * @return     { description_of_the_return_value }
	 */
	public int getsubone(){
		return this.sub1marks;
	}
	/**.
	 * gets the subtwo.
	 * @param      sub2marks  The sub 2 marks
	 * @return     { description_of_the_return_value }
	 */
	public int getsubtwo(){
		return this.sub2marks;
	}
	/**.
	 * gets the subthree.
	 * @param      sub3marks  The sub 3 marks
	 * @return     { description_of_the_return_value }
	 */
	public int  getsubthree(){
		return this.sub3marks;
	}
	/**.
	 * gets the totalmarks.
	 * @param      totalmarks  The totalmarks
	 * @return     { description_of_the_return_value }
	 */
	public int  getTotalmarks(){
		return this.totalmarks;
	}
	/**.
	 * gets the reservation.
	 * @param      reservation  The reservatio
	 * @return     { description_of_the_return_value }
	 */
	public String getReservation(){
		return this.reservation;
	}
	/**.
	 * { function_description }
	 * @param      that  The that
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(Student that) {
		String[] d1 = this.getDob().split("-");
        String[] d2 = that.getDob().split("-");
		if(this.totalmarks > that.totalmarks) return -1;
		if(this.totalmarks < that.totalmarks) return 1;
		if(this.sub3marks > that.sub3marks) return -1;
		if(this.sub3marks < that.sub3marks) return 1;
		if(this.sub2marks > that.sub2marks) return -1;
		if(this.sub2marks < that.sub2marks) return 1;
		if (Integer.parseInt(d1[2]) > Integer.parseInt(d2[2])) {
            return 1;
        } else if (Integer.parseInt(d1[2]) < Integer.parseInt(d2[2])) {
            return -1;
        } else if (Integer.parseInt(d1[1]) < Integer.parseInt(d2[1])) {
            return 1;
        } else if (Integer.parseInt(d1[1]) < Integer.parseInt(d2[1])) {
            return -1;
        } else if (Integer.parseInt(d1[0]) < Integer.parseInt(d2[0])) {
            return 1;
        } else if (Integer.parseInt(d1[0]) < Integer.parseInt(d2[0])) {
            return -1;
        } else {
            return 0;
        }
	}

    public String toString() {
        String str = "";
            str += this.studentname + "," + this.totalmarks + "," + this.reservation;
        return str;
    }
}