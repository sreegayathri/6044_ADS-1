/**
 * {Student class}.
 */
class Student {
    private int rollnumber;
     // name of the student.
    private String name;
     //total marks of student.
    private Double totalmarks;
    /**
     * Constructs with parameters.
     *
     * @param      name   The name
     * @param      marks  The marks
     */
    Student(final String name, final Double marks) {
        this.name = name;
        this.totalmarks = marks;
    }
    /**
     * to get student name.
     * @return     { description_of_the_return_value }
     */
    public String getname() {
        return this.name;
    }
    /**
     * to get student's totalmarks.
     * @return     { description_of_the_return_value }
     */
    public Double gettotalmarks() {
        return this.totalmarks;
    }
}