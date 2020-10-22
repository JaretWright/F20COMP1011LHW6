package SubClassExamples;

import java.util.TreeMap;

public class Student extends Person{
    private TreeMap<String, Integer> courses; //this should be a collection of course name and grades
    private int studentNum;

    public Student(String firstName, String lastName, String phoneNumber, int studentNum) {
        super(firstName, lastName, phoneNumber);
        setStudentNum(studentNum);
        courses = new TreeMap<>();
    }

    public TreeMap<String, Integer> getCourses() {
        return courses;
    }

    /**
     *
     * @param courseCode - must be in the pattern XXXX 1234 eg COMP 1011
     * @param grade
     */
    public void addCourse(String courseCode, int grade) {
        if (courseCode.matches("[A-Z]{4}\\s[0-9]{4}") && grade >= 0 && grade <= 100)
            courses.put(courseCode, grade);
        else
            throw new IllegalArgumentException("invalid course code or grade");

    }

    public int getStudentNum() {
        return studentNum;
    }

    private void setStudentNum(int studentNum) {
        if (studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be greater than 0");
    }

    @Override
    public boolean needsCoffee() {
        return true;
    }
}
