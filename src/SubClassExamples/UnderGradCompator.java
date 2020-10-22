package SubClassExamples;

import java.util.Comparator;

public class UnderGradCompator implements Comparator<Student> {

    /**
     * -1 indicates the student should be sorted earlier
     * 0  indicates the students are equal
     * +1 indicates the students should be sorted after
     * @param s1
     * @param s2
     * @return
     */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
